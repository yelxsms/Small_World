import torch
import torch.nn as nn
import torch.utils.data as Data
import torchvision


torch.manual_seed(1)  #初始化
EPOCH = 10            #批训练次数
BATCH_SIZE = 256      #每批训练的个数
LR = 0.008
DOWNLOAD_MNIST = True

#数据提取
train_data = torchvision.datasets.MNIST(
    root='./data/',
    train=True,
    transform=torchvision.transforms.ToTensor(),     #转换格式
     download=DOWNLOAD_MNIST,
)
test_data = torchvision.datasets.MNIST(
    root='./data/',
    train=False
)
train_loader = Data.DataLoader(
    dataset=train_data,
    batch_size=BATCH_SIZE,
    shuffle=True
)

test_x = torch.unsqueeze(test_data.train_data, dim=1).type(torch.FloatTensor)[:2000] / 255     #将test_data中的train_data提取并扩充，加上batch——size的维度。/255压缩像素
test_y = test_data.test_labels[:2000]

#搭建Lenet神经网络
class LeNet(nn.Module):
    def __init__(self):
        super(LeNet, self).__init__()
        self.conv1 = nn.Sequential(
            nn.Conv2d(
                in_channels=1,
                out_channels=6,
                kernel_size=5,
                stride=1
            ),
            nn.Sigmoid(),
            nn.MaxPool2d(2,2)
        )
        self.conv2 = nn.Sequential(
            nn.Conv2d(
                in_channels=6,
                out_channels=16,
                kernel_size=5,
                stride=1
            ),
            nn.Sigmoid(),
            nn.MaxPool2d(2,2),
        )
#搭建全连接层
        self.out = nn.Sequential(
            nn.Linear(16 * 4 * 4, 120),   #展平
            nn.Sigmoid(),
            nn.Linear(120, 84),
            nn.Sigmoid(),
            nn.Linear(84, 10)
        )

    #展平
    def forward(self, x):
        x = self.conv1(x)
        x = self.conv2(x)
        x = x.view(x.shape[0], -1)
        output = self.out(x)
        return output

# #训练
# cnn = CNN()
# optimizer = torch.optim.Adam(cnn.parameters(), lr=LR)   #Adam优化器
# loss_func = nn.CrossEntropyLoss()                       #损失函数
# for epoch in range(EPOCH):
#     for step, (b_x, b_y) in enumerate(train_loader):    #分配data
#         output = cnn(b_x)
#         loss = loss_func(output, b_y)                   #输出损失函数和它的标签
#         optimizer.zero_grad()                           #清除梯度函数
#         loss.backward()                                 #反向传播
#         optimizer.step()                                #应用梯度
#
#         if step % 50 == 0:
#             test_output = cnn(test_x)
#             pred_y = torch.max(test_output, 1)[1].data.numpy()
#             accuracy = float((pred_y == test_y.data.numpy()).astype(int).sum()) / float(test_y.size(0))
#             print('Epoch: ', epoch, '| train loss: %.4f' % loss.data.numpy(), '| test accuracy: %.4f' % accuracy)
#
# torch.save(cnn.state_dict(), 'cnn.pkl')
