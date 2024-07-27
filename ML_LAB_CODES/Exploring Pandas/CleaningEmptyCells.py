import pandas as pd
#empty cells 
#empty cells can potentially give you a wrong result when you analyze data

#remove row
'''
one way to deal with empty cells is to remove rows that contain empty cells
This is usually OK,since the data sets can be very big, and removing a few rows will not have a big impact on the result
'''
data=pd.read_csv('data1.csv')
new_data=data.dropna()
print(new_data.to_string())