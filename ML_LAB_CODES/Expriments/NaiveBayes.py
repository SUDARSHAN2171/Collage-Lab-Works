import numpy as np
from sklearn.naive_bayes import MultinomialNB
from sklearn.datasets import load_iris
import matplotlib.pyplot as plt

iris = load_iris()
X = iris.data[:, :2] 
y = iris.target

clf = MultinomialNB()
clf.fit(X, y)

plt.scatter(X[:, 0], X[:, 1], c=y)
x_min, x_max = X[:, 0].min() - 1, X[:, 0].max() + 1
y_min, y_max = X[:, 1].min() - 1, X[:, 1].max() + 1
xx, yy = np.meshgrid(np.arange(x_min, x_max, .1), np.arange(y_min, y_max, .1))
plt.xlim(x_min, x_max)
plt.ylim(y_min, y_max)
plt.xlabel('Feature 1')
plt.ylabel('Feature 2')
plt.title('Naïve Bayes Classifier')

Z = clf.predict(np.c_[xx.ravel(), yy.ravel()])
Z = Z.reshape(xx.shape)
plt.contour(xx, yy, Z, alpha=0.8)