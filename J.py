N = int(input("Enter a numb:"))
def fib(n):
    if n<=1:
        return n
    else:
        return(fib(n-1)+fib(n-2))
if N<=0:
    print("Please enter a positive number")
else:
    print("Fib:")
    for i in range(N):
        print(fib(i))
