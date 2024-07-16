#Slicing in python means taking elements from one given index to another given index.

import numpy as np

#in a array from index 1 to 5
array1 = np.array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
print("This will print the element from index 0-5 in array1 :",array1[1:5])
print("This will automaticly print the array from index 4 to the last : ",array1[4:])
print("This will print the array from begin to the 4th index : ",array1[:4])

#Negative Slicing
