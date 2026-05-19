def even(n):
    if n%2 == 0:
        return 1;
    else:
        return 0;

N = int(input("Enter N:"))
if(even(N)==1):
    print("N is even")
else:
    print("N is odd")
even(N)