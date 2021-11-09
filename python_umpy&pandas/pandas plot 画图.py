import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
#plot data
data =pd.Series(np.random.randn(1000),index=np.arange(1000))
data=data.cumsum() #累计求和的过程
data.plot()
# plt.show()


#dataframe
data=pd.DataFrame(np.random.randn(1000,4),
                  index=np.arange(1000),columns=list("ABCD"))
data=data.cumsum()
# print(data.head(3))
# data.plot()
ax=data.plot.scatter(x='A',y='B',color='DarkBlue',label='Class 1')
data.plot.scatter(x='C',y='C',color='DarkGreen',label='cClass 2',
                  ax=ax)
plt.show()