import matplotlib.pyplot as plt
import numpy as np
x=np.linspace(-3,3,50)
y1=x**2
y2=2*x+1
plt.figure()
plt.plot(x,y2)
plt.plot(x,y1,color='red',linewidth=1.0,linestyle='--')
plt.xlim(-1,3)
plt.ylim(-1,6)               #设置xy的取值范围
plt.xlabel('this is x')
plt.ylabel('this is y')       #设置xy轴的显示内容
plt.yticks([-0.5,0,3,5],['bad','normal','fine','good'])    #使得y轴坐标对应字符
#gca='get current axis'
ax=plt.gca()
ax.spines['right'].set_color('none')
ax.spines['top'].set_color('none')    #设置脊梁（边框）参数，此处设置没了
ax.xaxis.set_ticks_position('bottom')
ax.yaxis.set_ticks_position('left')
ax.spines['bottom'].set_position(('data',0))
ax.spines['left'].set_position(('data',-1))     #移动x轴y轴的位置，规定x轴的位置在y的0处，y轴的位置在x的-1处
plt.show()