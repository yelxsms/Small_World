import torch
from torch.autograd import Variable
import torch.nn.functional as F
import matplotlib.pyplot as plt


x=torch.unsqueeze(torch.linspace(-1,1,100),dim=1)    #将一维数字转化成二维
y=x.pow(2)+0.2*torch.rand(x.size())    #确定y的表达式以及加入一些噪点的影响，进而使得这个图像离散化

#将x,y的值转化成Variable的格式，神经网络只能输入Variable的格式
x=Variable(x)
y=Variable(y)

#打印散点图
#plt.scatter(x.data.numpy(),y.data.numpy())
#plt.show()


#搭建
class Net(torch.nn.Module):#定义一个类
    def __init__(self,n_feature,n_hidden,n_output):  #搭建神经网络层所需要的信息
        super(Net,self).__init__()   #继承net模块，输出init的结果
        self.hidden=torch.nn.Linear(n_feature,n_hidden)#一层神经网络，包括输入个数和输出个数
        self.predict = torch.nn.Linear(n_hidden, n_output)#另一层神经网络，输入的值是上一层神经网络的输出值
    def forward(self,x):             #前向传递
        x =F.relu(self.hidden(x))      #使用激活函数使得被hidden层处理过的x值激活
        x=self.predict(x)       #输出层，将上一层处理过的x输出
        return x

net=Net(1,10,1)

plt.ion()
plt.show()   #实时打印

#神经网络的优化
optimizer=torch.optim.SGD(net.parameters(),lr=0.5)    #将数据传入，并规定好学习的效率
loss_func=torch.nn.MSELoss()    #计算均方差

#训练
for t in range(1000):  #训练的步数
    prediction=net(x)   #预测值
    loss=loss_func(prediction,y)  #计算真实值和实际值的误差
    #优化
    optimizer.zero_grad()   #重置梯度为0
    loss.backward()  #前向传递并计算误差
    optimizer.step()  #根据规定好的学习率将其进一步优化

    if t % 5 == 0:
        plt.cla()
        plt.scatter(x.data.numpy(),y.data.numpy())   #打印原始数值
        plt.plot(x.data.numpy(),prediction.data.numpy(),'r-',lw=5)   #神经网络的预测值
        plt.pause(0.1)

plt.ioff()
plt.show()