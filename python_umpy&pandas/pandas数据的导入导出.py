import pandas as pd

data=pd.read_csv('student.csv')        #读取csv文件
print(data)

data.to_pickle('student.pickle')    #将文件保存在student,pickle文件之中