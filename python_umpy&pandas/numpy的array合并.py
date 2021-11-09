import numpy as np
a=np.array([11,2,3])
b=np.array([3,244,5])
c=np.vstack((a,b))   #合并ab两个数列
e=np.hstack((a,b))      #左右合并
print(c)
print(e)