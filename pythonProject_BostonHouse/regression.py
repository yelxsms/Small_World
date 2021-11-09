from sklearn.linear_model import LinearRegression,Ridge,Lasso       # 性回归，岭回归，套索回归
from sklearn.metrics import r2_score            #效果评估
import sklearn.datasets as datasets
import matplotlib.pyplot as plt

boston=datasets.load_boston()
data=boston.data
target=boston.target

# 训练数据
X_train=data[:481]
Y_train=data[:481]

# 测试数据
x_test=data[481:]
y_true=target[481:]

# 创建线性回归、岭回归、套索回归模型
line=LinearRegression()
ridge=Ridge()
lasso=Lasso()

# 训练模型
line.fit(X_train,Y_train)
ridge.fit(X_train,Y_train)
lasso.fit(X_train,Y_train)

# 预测模型
line_y_pre=line.predict(x_test)
ridge_y_pre=ridge.predict(x_test)
lasso_y_pre=lasso.predict(x_test)

# 绘图
plt.plot(y_true,label='True')
plt.plot(line_y_pre,label='Line')
plt.plot(ridge_y_pre,label='Ridge')
plt.plot(lasso_y_pre,label='Lasso')
plt.legend()
plt.show()

# 模型评估
line_score=r2_score(y_true,line_y_pre)
ridge_score=r2_score(y_true,ridge_y_pre)
lasso_score=r2_score(y_true,lasso_y_pre)

print(line_score,ridge_score,lasso_score)
