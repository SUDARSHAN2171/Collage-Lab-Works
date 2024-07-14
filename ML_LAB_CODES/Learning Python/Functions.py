#Block of statement that performs a specific task
'''
    def func_name(param1,param2..):  <--This is function definition
        #some work
        return val
    func_name(arg1,arg2..)#function call
'''
def cal_sum(a,b):
     print(a+b)
     return sum
a=5
b=10
#Calling the function
cal_sum (a,b)


def print_hello():
    print("Hello World")
#Calling the function

print_hello()
print_hello()
print_hello()
output=print_hello()
print(output) #the return type is not there so returns None

#average of 3 numbers
def average(x,y,z):
    print((x+y+z)/3)
q=int(input("Enter value for q : "))
p=int(input("Enter value for p : "))
r=int(input("Enter value for r : "))
average(q,p,r)