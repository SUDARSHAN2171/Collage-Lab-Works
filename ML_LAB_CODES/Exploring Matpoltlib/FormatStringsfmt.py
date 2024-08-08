import matplotlib.pyplot as plt
import numpy as np

#you can also use the shortcut string notation parameter to specify the marker

#this parameter is also called fmt, and is written with this syntax:

#maker|line|color

#mark each point with a circle
yaxis = np.array([5,2,9,1,4])
plt.plot(yaxis,'o:r')
plt.show()