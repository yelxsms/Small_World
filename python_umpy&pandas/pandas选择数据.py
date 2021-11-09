import pandas as pd
import numpy as np
dates=pd.date_range('20210724',periods=6)
df=pd.DataFrame(np.arange(24).reshape((6,4)),index=dates,columns=['A','B','C','D'])
print(df)
#纯标签
print(df['A'],df.A)    #打印第'A'列
print(df[0:3],df['20210725':'20210727'])   #打印0到3行
print(df.loc[:,['A','B']])   #打印所有行第’A’列和‘B’列的数据
print(df.loc['20210724',['A','B']])   #打印20210724行第'A''B'列的数据
#纯数字
print(df.iloc[3,2])   #打印第三行第二列的数据
print(df.iloc[3:5,1:3])   #打印第三行到第五行的第一列到第三列的数据
print(df.iloc[[1,3,4],1:3])    #打印第124行的第1到3列的数据

print(df)
print(df[df.A>8])    #筛选df中第A列小于大于8的数据