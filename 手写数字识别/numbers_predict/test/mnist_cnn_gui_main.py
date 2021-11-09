import torch
import sys
import numpy as np
from dataset.mnist import load_mnist
from PIL import Image, ImageQt
import torch.nn.functional as F
from run.layout import Ui_MainWindow
from run.paintboard import PaintBoard
from PyQt5.QtWidgets import QMainWindow, QDesktopWidget, QApplication
from PyQt5.QtWidgets import QLabel, QMessageBox, QPushButton, QFrame
from PyQt5.QtGui import QPainter, QPen, QPixmap, QColor, QImage
from PyQt5.QtCore import Qt, QPoint, QSize

from model_training import LeNet

MODE_MNIST = 1  #随机抽取
MODE_WRITE = 2  #手写输入

# 读取
(_, _), (x_test, _) = load_mnist(normalize=True, flatten=False, one_hot_label=False)

network = LeNet()
network.load_state_dict(torch.load('cnn.pkl'))


class MainWindow(QMainWindow, Ui_MainWindow):
    def __init__(self):
        super(MainWindow, self).__init__()

        self.mode = MODE_MNIST
        self.result = [0, 0]

        self.setupUi(self)
        self.center()

        self.paintBoard = PaintBoard(self, Size=QSize(224, 224), Fill=QColor(0, 0, 0, 0))
        self.paintBoard.setPenColor(QColor(0, 0, 0, 0))
        self.dArea_Layout.addWidget(self.paintBoard)

        self.clearDataArea()

    def center(self):
        framePos = self.frameGeometry()
        scPos = QDesktopWidget().availableGeometry().center()
        framePos.moveCenter(scPos)
        self.move(framePos.topLeft())

    def closeEvent(self, event):
        reply = QMessageBox.question(self, '信息', "是否关闭?", QMessageBox.Yes | QMessageBox.No, QMessageBox.Yes)

        if reply == QMessageBox.Yes:
            event.accept()
        else:
            event.ignore()

    def clearDataArea(self):
        self.paintBoard.Clear()
        self.lbDataArea.clear()
        self.lbResult.clear()
        self.lbCofidence.clear()
        self.result = [0, 0]

    def cbBox_Mode_Callback(self, text):
        if text == 'MINIST随机抽取':
            self.mode = MODE_MNIST
            self.clearDataArea()
            self.pbtGetMnist.setEnabled(True)

            self.paintBoard.setBoardFill(QColor(0, 0, 0, 0))
            self.paintBoard.setPenColor(QColor(0, 0, 0, 0))

        elif text == '鼠标手写输入':
            self.mode = MODE_WRITE
            self.clearDataArea()
            self.pbtGetMnist.setEnabled(False)

            self.paintBoard.setBoardFill(QColor(0, 0, 0, 255))
            self.paintBoard.setPenColor(QColor(255, 255, 255, 255))


    def pbtClear_Callback(self):
        self.clearDataArea()

    #识别
    def pbtPredict_Callback(self):
        __img, img_array = [], []

        # 获取图像
        if self.mode == MODE_MNIST:
            __img = self.lbDataArea.pixmap()
            if __img == None:
                __img = ImageQt.ImageQt(Image.fromarray(np.uint8(np.zeros([224, 224]))))
            else:
                __img = __img.toImage()
        elif self.mode == MODE_WRITE:
            __img = self.paintBoard.getContentAsQImage()

        #转换成pil类型
        pil_img = ImageQt.fromqimage(__img)
        pil_img = pil_img.resize((28, 28), Image.ANTIALIAS)

        img_array = np.array(pil_img.convert('L')).reshape(1, 1, 28, 28) / 255.0
        img_array = torch.FloatTensor(img_array)

        __result = network(img_array)
        __result = F.softmax(__result, dim=1)
        self.result[0] = torch.argmax(__result)
        self.result[1] = __result[0, self.result[0]]

        self.lbResult.setText("%d" % (self.result[0]))
        self.lbCofidence.setText("%.8f" % (self.result[1]))

    def pbtGetMnist_Callback(self):
        self.clearDataArea()

        img = x_test[np.random.randint(0, 9999)]
        img = img.reshape(28, 28)

        img = img * 0xff
        pil_img = Image.fromarray(np.uint8(img))
        pil_img = pil_img.resize((224, 224))

        #将pil转换成qimage
        qimage = ImageQt.ImageQt(pil_img)

        pix = QPixmap.fromImage(qimage)
        self.lbDataArea.setPixmap(pix)


if __name__ == "__main__":
    app = QApplication(sys.argv)
    Gui = MainWindow()
    Gui.show()

    sys.exit(app.exec_())
