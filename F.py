my_dict = {}
n = int(input("Enter a number of elements:"))
for i in range(n):
    key = input("Enter a key:")
    value = ("Enter a value:")
    my_dict[key]=value
sorted_dict = dict(sorted(my_dict.items()))
print("Original Dictionary:",my_dict)
print("Sorted Dictionary:",sorted_dict)