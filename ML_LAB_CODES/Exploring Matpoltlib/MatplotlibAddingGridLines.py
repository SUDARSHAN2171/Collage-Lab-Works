import matplotlib.pyplot as plt
import numpy as np

#add gird lines to a plot 
'''
with pyplot you can use the grid() function to add grid lines to the plot
'''
x = np.array([80, 85, 90, 95, 100, 105, 110, 115, 120, 125])
y = np.array([240, 250, 260, 270, 280, 290, 300, 310, 320, 330])
plt.title("Sudarshan's Data")
plt.xlabel("Average Pulse")
plt.ylabel("Calorie Burned")
plt.plot(x, y)
plt.grid()
plt.show()

#specify which grid lines to display
'''
You can use the axis parameter in the grid() function to specify which grid lines to display.
Legal values are: 'x', 'y', and 'both'. Default value is 'both'.
'''
x = np.array([80, 85, 90, 95, 100, 105, 110, 115, 120, 125])
y = np.array([240, 250, 260, 270, 280, 290, 300, 310, 320, 330])
plt.title("Sudarshan's Data")
plt.xlabel("Average Pulse")
plt.ylabel("Calorie Burned")
plt.plot(x, y)
plt.grid(axis = 'x')
plt.show()
#Set line properties for the grid
'''
you can also set the line properties of the grid, like this: grid (color='color',linestyle = 'linestyle',linewidth=number)
'''
x = np.array([80, 85, 90, 95, 100, 105, 110, 115, 120, 125])
y = np.array([240, 250, 260, 270, 280, 290, 300, 310, 320, 330])
plt.title("Sports Watch Data")
plt.xlabel("Average Pulse")
plt.ylabel("Calorie Burnage")
plt.plot(x, y)
plt.grid(color = 'green', linestyle = '--', linewidth = 0.5)
plt.show()