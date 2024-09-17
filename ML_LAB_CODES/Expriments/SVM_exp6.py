import numpy as np
import matplotlib.pyplot as plt
from sklearn.svm import SVR
from sklearn.preprocessing import StandardScaler

n = int(input("Enter the number of data points: "))

X = []
y = []

print("\nEnter the values for X and y (target variable):")
for i in range(n):
    x_value = float(input(f"Enter X[{i + 1}]: "))
    y_value = float(input(f"Enter y[{i + 1}]: "))
    X.append([x_value]) 
    y.append([y_value])  

X = np.array(X)
y = np.array(y)

scaler_X = StandardScaler()
scaler_y = StandardScaler()

X_scaled = scaler_X.fit_transform(X)
y_scaled = scaler_y.fit_transform(y.reshape(-1, 1)).flatten()  

epsilon_value = float(input("\nEnter the epsilon value for SVR (margin of tolerance): "))
svr_model = SVR(kernel='rbf', epsilon=epsilon_value) 
svr_model.fit(X_scaled, y_scaled)

y_pred_scaled = svr_model.predict(X_scaled)

y_pred_scaled = y_pred_scaled.reshape(-1, 1) 
y_pred = scaler_y.inverse_transform(y_pred_scaled).flatten()  

X_plot = np.linspace(min(X), max(X), 100).reshape(100, 1)
X_plot_scaled = scaler_X.transform(X_plot)
y_plot_scaled = svr_model.predict(X_plot_scaled)
y_plot = scaler_y.inverse_transform(y_plot_scaled.reshape(-1, 1)).flatten()

plt.scatter(X, y, color="blue", label="Actual Data", alpha=0.5)
plt.plot(X_plot, y_plot, color="red", label="SVR Prediction")
plt.xlabel("X")
plt.ylabel("y")
plt.legend()
plt.show()