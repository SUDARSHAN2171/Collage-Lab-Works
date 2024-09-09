import matplotlib.pyplot as plt
import numpy as np

#Creating Bars
'''
With Pyplot, you can use the bar() function to draw bar graphs:
'''
x = np.array(["A", "B", "C", "D"])
y = np.array([3, 8, 1, 10])
plt.bar(x,y)
plt.show()
#Horizontal Bars
'''
If you want the bars to be displayed horizontally instead of vertically, use the barh() function:
'''
x = np.array(["A", "B", "C", "D"])
y = np.array([3, 8, 1, 10])
plt.barh(x, y)
plt.show()

#Bar Color
'''
The bar() and barh() take the keyword argument color to set the color of the bars:
'''
x = np.array(["A", "B", "C", "D"])
y = np.array([3, 8, 1, 10])
plt.bar(x, y, color = "red")
plt.show()
#Color Names
'''
You can use any of the 140 supported color names.
'''

x = np.array(["A", "B", "C", "D"])
y = np.array([3, 8, 1, 10])
plt.bar(x, y, color = "hotpink")
plt.show()
#color Hex
x = np.array(["A", "B", "C", "D"])
y = np.array([3, 8, 1, 10])
plt.bar(x, y, color = "#4CAF50")
plt.show()