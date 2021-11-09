import pandas as pd
import numpy as np
dates=pd.date_range('20210724',periods=6)
df=pd.DataFrame(np.arange(24).reshape((6,4)),index=dates,columns=['A','B','C','D'])
print(df)

df.iloc[2,2]=1111   #修改第2行第二列的数据为1111
df.loc['20210725','C']=666
#df[df.A>0]=0     #将df中第A列中大于0的数据全部换为零
df.B[df.A>0]=0  #将df中第B列中第A列大于0的数据换为0
df['f']=np.nan     #插入一个f列，数据为空
df['E']=pd.Series([1,2,3,4,5,6],index=pd.date_range('20210724',periods=6))  #插入一个E列，数据为pandas随机生成，行列分别对应日期和E
print(df)