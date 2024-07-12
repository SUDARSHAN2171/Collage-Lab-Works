#loops are used to repeat instructions

#while loop
count = 1 #iterator
while count<=10 : #the process is called iteration
    print("Hello World",count)
    count+=1
    
print(count)

#print table 
num=input("Enter the number of your choice : ")
i=1
while i<=10 :
    print(i,"*",num,"=",int(num)*i)
    i+=1

#print the lis num2=[1,4,9,16,25,36,49,64,81,100]
idx=0
num2=[1,4,9,16,25,36,49,64,81,100]
while idx<len(num2):
    print(num2[idx])
    idx+=1
    
#search for element in the tuple using loop
num3=(1,4,9,16,25,36,49,64,81,100)
i=0
key=int(input("find the element : "))
while i<=9:
    if(num3[i]==key):
        print("Element found at ", i)
        break  #break is used to terminate if you have reached you solution
    else:
        print("Finding...")
    i+=1
    
    
#for loop 
lst=[1,2,3,4,5]
for val in lst:
    print(val)
vegatable=["Tomato","Apple","Bannana"]
for val in vegatable:
    print(val)
tup=(9,8,7,4,5,6,1,2,3)
for val in tup:
    print(val)
anem="Sudarshan"
for char in anem:
    print(char)