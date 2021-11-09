import numpy as np
a=np.arange(2,14).reshape(3,4)


print(a)
print(np.argmin(a))
print(np.argmax(a))    #输出最大最小值的索引

print(np.mean(a))
print(np.average(a))     #输出平均值

print(np.median(a))   #输出中位数

print(np.cumsum(a))    #累加列表

print(np.diff(a))       #累差列表

print(a)
print(np.transpose(a))   #矩阵对称操作一下

