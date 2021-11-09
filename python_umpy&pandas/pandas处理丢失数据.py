import pandas as pd
import numpy as np
dates=pd.date_range('20210724',periods=6)
df=pd.DataFrame(np.arange(24).reshape((6,4)),index=dates,columns=['A','B','C','D'])
df.iloc[0,1]=np.nan
df.iloc[1,2]=np.nan

#print(df.dropna(axis=0,how='any'))  #how=any or all  axis=0(行) or 1（列） 将有数据丢失的行删除
#print(df.fillna(value=0))    #将丢失的数据用0填充
print(df.isnull())      #判断df中是否有数据缺失，返回矩阵的真假值
print(np.any(df.isnull())==True)     #判断df中是否有数据确实，返回一个真假值