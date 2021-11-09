import pandas as pd

left=pd.DataFrame({'key':['k0','k1','k2','k3'],
                  'A':['A0','A2','A2','A3'],
                  'B':['B0','B1','B2','B3']})
right=pd.DataFrame({'key':['k0','k1','k2','k3'],
                  'C':['C0','C2','C2','C3'],
                  'D':['D0','D1','D2','D3']})
print(left)
print(right)
res=pd.merge(left,right,on='key')   #以key为基准将left和right相合并
print(res)


left=pd.DataFrame({'key1':['k0','k1','k2','k3'],
                'key2':['k2','k1','k2','k3'],
                  'A':['A0','A2','A2','A3'],
                  'B':['B0','B1','B2','B3']})
right=pd.DataFrame({'key1':['k0','k1','k2','k3'],
                'key2':['k0','k1','k2','k3'],
                  'C':['C0','C2','C2','C3'],
                  'D':['D0','D1','D2','D3']})
print(left)
print(right)
res=pd.merge(left,right,on=['key1','key2'],how='innner')  #left right inner outter     以key1和key2为基准将left和right相合并
print(res)