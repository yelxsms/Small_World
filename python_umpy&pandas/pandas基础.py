import numpy as np
import pandas as pd

a=pd.Series([16,25,36,24,58,69,72])
print(a)
print(type(a))


dates=pd.date_range('20210721',periods=6)
print(dates)


df=pd.DataFrame(np.arange(24).reshape((6,4)),index=dates,columns=['a','b','c','d'])      #生成行为dates列为abcd，数据为np顺序生成的24个数
print(df)
df2=pd.DataFrame(np.arange(12).reshape((3,4)))            #不规定行标和列标，系统默认行列标为01234......
print(df2)


pd3=pd.DataFrame({'A':1.,
                  'B':pd.Timestamp('20210721'),
                  'C':pd.Series(1,index=list(range(4)),dtype='float32'),
                  'D':np.array([3]*4,dtype='int32'),
                  'E':pd.Categorical(["test","rain","test","cloud"]),
                  'F':'lbwnb'})
print(pd3)
print('\n')
print(pd3.index)
print('\n')
print(pd3.columns)
print('\n')
print(pd3.values)
print('\n')
print(pd3.describe())         #count max min mean ........
print('\n')
print(pd3.T)                    #转置
print('\n')
print(pd3.sort_index(axis=1,ascending=False))        #按倒序输出列
print('\n')
print(pd3.sort_index(axis=0,ascending=True))     #按正序输出行
print('\n')
print(pd3.sort_values(by='E'))              #对‘E’列进行排序
