import pandas as pd
#empty cells 
#empty cells can potentially give you a wrong result when you analyze data

#remove row
'''
one way to deal with empty cells is to remove rows that contain empty cells
This is usually OK,since the data sets can be very big, and removing a few rows will not have a big impact on the result
'''
data=pd.read_csv('data1.csv')
new_data=data.dropna()      #this will not change the original dataframe
print(new_data.to_string())
print("\n")

#if we want to change the original dataframe use the 'inplace=True' argument:
data.dropna(inplace=True)
print(data.to_string())
#Now, the dropna(inplace = True) will NOT return a new DataFrame, but it will remove all rows containing NULL values from the original DataFrame.

#replace empty values
'''
Another way of dealing with empty cells is to insert a new value instead 
This way you do not have to delete entire rows just because of some empty cells
the fillna() method allows us to replace cells with a value
'''
#Replace null with 130
data.fillna(130,inplace=True)

#replace only for specified columns
'''
the above function replace all the null values in the dataframe
to only replace empty values for one column,specify the column name for the dataframe
'''
# #replace Null values in calories column with number 130
# data_new=pd.read_csv('data1.csv')
# data_new["Calories"].fillna(130,inplace=True)

#replace using mean,median or mode
'''
A common way to replace empty cells , is to calculate the mean, median or mode of the column
pandas uses the mean() median() & mode() method to calculate the respective values for a specified column
'''
store=data["Calories"].mean()
data["Calories"].fillna(store,inplace=True)