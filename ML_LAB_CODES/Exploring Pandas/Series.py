import pandas as pd
#series is like a column or table
#it is a 1-D array holding data of any type

array1=[1,2,3]
storearray1=pd.Series(array1)
print("This will print the array1 which the specific element at the position : ")
print(storearray1)
print("This will print value at 1st position in storearray1 : ",storearray1[1])

#create Labels
#with indexing we can create our own labels
array2=[1,2,3,4,5]
print("This will print the index as the list/label given : ")
storearray2=pd.Series(array2,index=["Sudarshan","Ujal","Tanay","Ashsih","Aadesh"])
print(storearray2)
print("This will print the value at the index Sudarshan : ",storearray2["Sudarshan"])

#key/value object as series
Student_City={"Sudarshan" : "Sangli" ,"Ujal": "Miraj" ,"Tanay" : 'Pune'}
store_Student_City=pd.Series(Student_City)
print(store_Student_City)

#data frame 
#data sets in panda are usually multi-dimensional tables,called as dataframes

data = {'Name': ['Sudarshan', 'Ujal', 'Tanay', 'Ashsih', 'Aadesh'],
        'Age': [25, 23, 22, 21, 20],
        'City': ['Sangli', 'Miraj', 'Pune', 'Ichalkaranji', 'Kolapur']}

df = pd.DataFrame(data)
print(df)
print(df["Name"])
