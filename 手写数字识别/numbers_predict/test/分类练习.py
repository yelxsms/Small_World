import torch
import torch.nn.functional as F
import matplotlib.pyplot as plt

n_data = torch.ones(100, 2)

x0 = torch.normal(2 * n_data, 1)

y0 = torch.zeros(100)
x1 = torch.normal(-2 * n_data, 1)
y1 = torch.ones(100)
x = torch.cat((x0, x1), 0).type(torch.FloatTensor)
print(x)
y = torch.cat((y0, y1), ).type(torch.LongTensor)

class Net(torch.nn.Module):
    def __init__(self, n_features, n_hidden, n_output):
        super(Net, self).__init__()
        self.hidden = torch.nn.Linear(n_features, n_hidden)  #线性运算层
        self.predict = torch.nn.Linear(n_hidden, n_output)  #线性运算层

    def forward(self, x):  #向前传播
        x = F.relu(self.hidden(x))  #激活函数relu
        x = self.predict(x)  #再过一层线性运算
        return x


net = Net(2, 10, 2)   #实例化网络模型

plt.ion()

optimizer = torch.optim.SGD(net.parameters(), lr=0.05)  #梯度下降
loss_func = torch.nn.CrossEntropyLoss().cuda()  #损失函数
for t in range(100000):  #训练10000次
    prediction = net(x)
    predict_fl = torch.max(prediction, dim=1)[1]
    predict_last = predict_fl.data.numpy()
    loss = loss_func(prediction, y)  #计算损失
    optimizer.zero_grad()  #清空梯度
    loss.backward()  #返回梯度信息
    optimizer.step()
    plt.cla()
    plt.scatter(x[:, 0], x[:, 1], c=predict_last)
    plt.pause(0.1)
plt.ioff()
plt.show()
