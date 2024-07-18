import numpy as np
#Iterating Arrays
#Iterating means going through elements one by one.

#iterate on the elements of the following 1-D array
array1=np.array([1,2,3,4,5])
print("This will print array1 : ")
for x in array1:
    print(x)
    
#iterate on the elements of the following 2-D array
#in 2-D array it will go through all the rows
array2=np.array([[1,2,3,4,5],[6,7,8,9,10]])
print("This will print array2 : ")
for x in array2:
    print(x)  
    
#iterate on each scalar element of 2-D array
array3=np.array([[1,2,3,4,5],[6,7,8,9,10]])
print("This will print array3 : ")
for x in array3:
    for y in x:
        print(y) 
        
#iterating 3-D arrays
array4=np.array([[[1, 2, 3], [4, 5, 6]], [[7, 8, 9], [10, 11, 12]]])
print("This will print array4 : ")
for x in array4:
    print(x)
    
