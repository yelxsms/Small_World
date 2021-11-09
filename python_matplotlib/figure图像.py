import matplotlib.pyplot as plt
import numpy as np
x=np.linspace(-3,3,50)
y1=x**2+4
y2=2*x+1
plt.figure()
plt.plot(x,y1)
plt.figure(num=3,figsize=(10,5))   #设置图像的编号，设置图像的长宽
plt.plot(x,y2)
plt.plot(x,y1,color='red',linewidth=5.0,linestyle='--')    #加入第二条曲线
plt.show()