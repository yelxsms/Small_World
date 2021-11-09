import numpy as np

#矩阵的加减法
a=np.array([4,5,6,7])
b=np.arange(0,4)
print(a)
print(b)
c=a-b
print(c)
d=a+b
print(d)

#乘方
e=b**2   #b的平方
print(e)

#三角函数运算
f=np.sin(a)
g=np.cos(b)
print(f,g)

#大小的判断,返回真值列表
print(a)
print(a<6)

#2阶矩阵乘法
a=np.array([[1,2],[4,5]])
b=np.arange(4).reshape((2,2))
print(a)
print(b)

c1=a.dot(b)
c2=np.dot(a,b)

print(c2)
print(c1)

#随机生成矩阵
a=np.random.random((4,5))  #从0到1中随机生成一个4行5列的矩阵
print(a)
print(np.sum(a))
print(np.min(a))
print(np.max(a))
#axis=1在一列中求，axis=0在一行当中求
print(np.sum(a,axis=1))
print(np.min(a,axis=1))
print(np.max(a,axis=0))