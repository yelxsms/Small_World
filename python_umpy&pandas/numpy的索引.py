import numpy as np
a=np.arange(3,15).reshape((3,4))
print(a)
print(a[2])
print(a[2,3])
print(a[2][3])
print(a[2,1:3])   #输出第三行的第二个和第三个数

for row in a:
    print(row)

print(a.T)
for column in a.T:
        print(column)   #输出对称矩阵的列

print(a.flatten())
for item in a.flat:
    print(item)