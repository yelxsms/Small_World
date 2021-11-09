import pandas as pd
import numpy as np

# contactennating
df1=pd.DataFrame(np.ones((3,4))*0,columns=['a','b','c','d'])
df2=pd.DataFrame(np.ones((3,4))*1,columns=['a','b','c','d'])
df3=pd.DataFrame(np.ones((3,4))*2,columns=['a','b','c','d'])
print(df1)
print(df2)
print(df3)

res=pd.concat([df1,df2,df3],axis=0,ignore_index=True)   #将df123按照行相加合并在一起，重置行序列
print(res)

#join,['innner']['outter']
df1=pd.DataFrame(np.ones((3,4))*0,columns=['a','b','c','d'],index=[1,2,3])
df2=pd.DataFrame(np.ones((3,4))*1,columns=['b','c','d','e'],index=[2,3,4])
print(df1)
print(df2)
res=pd.concat([df1,df2],join='outer')               #合并，将不对应的元素用Nan补全
print(res)
res2=pd.concat([df1,df2],join='inner',ignore_index=True)  #合并，将不对应的元素列直接删去
print(res2)

#append
df1=pd.DataFrame(np.ones((3,4))*0,columns=['a','b','c','d'])
df2=pd.DataFrame(np.ones((3,4))*1,columns=['a','b','c','d'])
df3=pd.DataFrame(np.ones((3,4))*2,columns=['a','b','c','d'])
#res=df1.append(df2,ignore_index=True)          #在df1的基础之上加上df2
res=df1.append([df2,df3],ignore_index=True) #在df1的基础之上加上df2和df3
print(res)

df4=pd.DataFrame(np.ones((3,4))*0,columns=['a','b','c','d'])
s1=pd.Series([1,2,3,4],index=['a','b','c','d'])
res2=df4.append(s1,ignore_index=True)               #在df4的基础之上加上一行元素，并与之索引相对称
print(res2)
