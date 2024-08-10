import matplotlib.pyplot as plt
import numpy as np

#Create labels  for a plot 
'''
with pyplot you can use the xlabel() and ylabel() function to set a label for the x-axis and y-axis
'''
x = np.array([80, 85, 90, 95, 100, 105, 110, 115, 120, 125])
y = np.array([240, 250, 260, 270, 280, 290, 300, 310, 320, 330])
plt.plot(x, y)
plt.xlabel("Average Pulse")
plt.ylabel("Calorie Burned")
plt.show()

#create a title for a plot
#with pyplot you can use the title() function to set a title for the plot

x = np.array([80, 85, 90, 95, 100, 105, 110, 115, 120, 125])
y = np.array([240, 250, 260, 270, 280, 290, 300, 310, 320, 330])
plt.plot(x, y)
plt.title("Sudarshan's Data")
plt.xlabel("Average Pulse")
plt.ylabel("Calorie Burned")
plt.show()