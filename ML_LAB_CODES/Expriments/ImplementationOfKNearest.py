import pandas as pd
import numpy as np
from sklearn.preprocessing import LabelEncoder
from sklearn.neighbors import KNeighborsClassifier, NearestNeighbors
from sklearn.model_selection import train_test_split

df = pd.read_csv('CC DataSet.csv')

le = LabelEncoder()
df['Loan'] = le.fit_transform(df['Loan'])

X = df[['Age', '#CC', 'Income']]
y = df['Loan']

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

knn = KNeighborsClassifier(n_neighbors=5)
knn.fit(X_train, y_train)

nn = NearestNeighbors(n_neighbors=2)
nn.fit(X_train)

def predict_loan(age, num_cc, income):
    input_data = pd.DataFrame([[age, num_cc, income]], columns=['Age', '#CC', 'Income'])
    prediction = knn.predict(input_data)
    distances, indices = nn.kneighbors(input_data)
    nearest_neighbors = X_train.iloc[indices[0]]
    if age > 25 and num_cc > 0 and income < 20000:
        return f'Y' if prediction[0] == 1 else 'N', nearest_neighbors
    else:
        return 'N', None

age = int(input("Enter the age: "))
num_cc = int(input("Enter the number of credit cards: "))
income = int(input("Enter the income: "))

result, nearest_neighbors = predict_loan(age, num_cc, income)
print(f'Prediction: {result}')
if nearest_neighbors is not None:
    print('2 Nearest Neighbors:')
    print(nearest_neighbors)