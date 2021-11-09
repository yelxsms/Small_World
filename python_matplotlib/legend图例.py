import matplotlib.pyplot as plt
import numpy as np
x=np.linspace(-3,3,50)
y1=x**2
y2=2*x+1
plt.figure()
plt.xlim(-1,3)
plt.ylim(-1,6)

plt.xlabel('this is x')
plt.ylabel('this is y')

plt.plot(x,y2,label='up')
plt.plot(x,y1,color='red',linewidth=1.0,linestyle='--',label='down')      #label=''用于表示此条曲线代表的东西
plt.legend()   #画出图例

plt.show()
