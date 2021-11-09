import matplotlib.pyplot as plt
import numpy as np

x=np.linspace(-3,3,50)
y=2*x+1
plt.plot(x,y)
ax=plt.gca()
ax.spines['right'].set_color('none')
ax.spines['top'].set_color('none')
ax.xaxis.set_ticks_position('bottom')
ax.yaxis.set_ticks_position('left')
ax.spines['bottom'].set_position(('data',0))
ax.spines['left'].set_position(('data',0))

x0=1
y0=2*x0+1
plt.scatter(x0,y0,s=40,color='red')    #打印出x0y0这个点
plt.plot([x0,x0],[y0,0],'k--',lw=1)     #打印虚线
plt.annotate('2x+1=%s'%y0,xy=(x0,y0),xycoords='data')  #标注点

plt.text(-3.7,3,'this is the picture')    #打印文本

plt.show()