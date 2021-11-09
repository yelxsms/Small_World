import torch
import torch.utils.data as Data

BATCH_SIZE =5    #批的数量

#确定xy的取值
x=torch.linspace(1,10,10)
y=torch.linspace(10,1,10)

torch_dataset=Data.TensorDataset(x,y)  #建立数据集
loader=Data.DataLoader(
    dataset=torch_dataset,   #将torch_dataset中的data传入到dataset之中
    batch_size=BATCH_SIZE,   #定义批数
    shuffle=True,             #data是否随机
    num_workers=2,            #2个进程提取，使之更有效率
)    #拆分成批训练

for epoch in range(3):    #规定数据训练次数
    for step,(batch_x,batch_y) in enumerate(loader):     #训练的数据为loader中的data
        #训练
        print('Epoch:',epoch,'|Step:',step,'|batch x:',batch_x.numpy(),'|batch y:',batch_y.numpy())