import numpy as np


#a=np.array([1,2,3],dtype=np.float)
#print(a.dtype)


#a=np.array([[1,2,3],[4,5,6]])
#print(a)

#a=np.zeros((3,5))   #生成3行5列的零矩阵
#print(a)

#a=np.ones((8,8))   #生成8行8列的1矩阵
#print(a)


# a=np.arange(10,30,5).reshape((2,2))   #顺序生成矩阵，重新定义其shape为2行2列
# print(a)

a=np.linspace(1,10,6).reshape((2,3))    #生成线段，（起点，终点，线段生成数量）
print(a)