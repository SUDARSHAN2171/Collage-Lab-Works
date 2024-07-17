import numpy as np
#copy is just creating the replica of the original array
#where as view is just watching the array 
'''
The copy owns the data and any changes made to the copy will not affect original array, and any changes made to the original array will not affect the copy.

The view does not own the data and any changes made to the view will affect the original array, and any changes made to the original array will affect the view.
'''


#copy
#Make a copy, change the original array, and display both arrays:
array1=np.array([1,2,3,4,5])
copyarray1=array1.copy()
print("This is the exact of the original array : ",copyarray1)
copyarray1[2]=0
print("This the copy array after the change is made : ",copyarray1)
print("This is the original array : ",array1)


#view
#Make a view, change the original array, and display both arrays:
array2=np.array([1,2,3,4,5])
viewarray2=array2.view()
array2[2]=0
print("This is the original array2 : ",array2)
print("This is the viewarray2 : ",viewarray2)

#Make a view, change the view, and display both arrays:
array3=np.array([1,2,3,4,5])
viewarray3=array3.view()
viewarray3[3]=0
print("This is the original array3 : ",array3)
print("This is the view of the array3 : ",viewarray3)