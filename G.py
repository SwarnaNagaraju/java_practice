import numpy as np
list = []
n = int(input("Enter a number of elements:"))
print("Enter a list of elements:")
for i in range(0,n):
    ele = int(input())
    list.append(ele)
    print(list)
print("Mean:",np.mean(list))
print("Variance:",np.var(list))
print("Standard Deviation:",np.std(list))
