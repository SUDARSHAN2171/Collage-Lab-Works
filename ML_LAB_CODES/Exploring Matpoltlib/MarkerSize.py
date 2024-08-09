import matplotlib.pyplot as plt
import numpy as np

#you cna use the keyword argument markersize or the shorter version, ms to set the size of the markers

yaxis=np.array([7,2,5,1,9])
plt.plot(yaxis,marker='o',ms=20)  # basiclly what it does is that ot just increase or decreases the size of the end points
plt.show()
