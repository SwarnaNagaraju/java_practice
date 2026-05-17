def fact(n):
    if n ==0 or n==1:
        return n
    else:
        return n*fact(n-1)
    
N = int(input("Enter a N:"))
if N<0:
    print("please enter a positive number")
else:
    print(fact(N))