#when a function call itself repeatedly
def show(n):
    if(n==0):  #base case it is where the loop will end
        return
    print(n)
    show(n-1)
show(5) 