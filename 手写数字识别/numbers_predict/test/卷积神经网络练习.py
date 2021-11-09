import torch
import torch.nn as nn
from torch.utils.data as Data
import torchvision
import matplotlib.pyplot as plt

EPOCH=1
BATCH_SIZE=50
LR=0.001
DOWNLOAD_MNIST=True

#下载数据
train_data=torchvision.datasets.MNIST(
    root='./mnist/',
    train=True,
    transform=torchvision.transforms.ToTensor(),    #将图片数据转换成tensor的格式
    download=DOWNLOAD_MNIST
)

train_loader=Data.DataLoader(dataset=train_data,batch_size=BATCH_SIZE,shuffle=True,num_worker=2)
test_data=torchvision.datasets.MNIST(root='./mnist/',train=False)
test_x=Variable(torch.unsqueeze(test_data.test_data,dim=1),volatile=True).type(torch.FloatTensor)[:2000]/255
test_y=test_data.test_labels[:2000]
#构建CNN网络
class CNN(nn.Module):
    def __init__(self):
        super(CNN,self).__init__()
            self.conv1=nn.Sequential(
                nn.Conv2d(                #（1，28，28）
                    in_channels=1,   #单层
                    out_channels=16,    #16个卷积核同时卷积
                    kernel_size=5,    #卷积核的大小为5*5
                    string=1,     #步长
                    padding_mode=2,  #包围0
                ),    #conv2d信息收集器   #（16，28，28）
                nn.ReLU(),
                nn.MaxPool2d(kernel_size=2),    #最大池化层（16，14，14）
            )
        self.conv2=nn.Sequential(     #（16，14，14）
            nn.Conv2d(16,32,5,1,2),    #（32，14，14）
            nn.ReLU(),
            nn.MaxPool2d(2)         #（32，7，7）
        )
        self.out=nn.Linear(32*7*7,10),          #输出层，将数据展平成一个二位的数据，10个类

        def forward(self,x):
            x= self.conv1(x)
            x= self.conv2(x)                #(batch,32,7,7)
            x=x.view(x.size(0),-1)          #(batch,32*7*7)
            output=self.out(x)
            return output
    cnn=CNN()




