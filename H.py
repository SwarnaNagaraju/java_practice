s = input("Enter a number:")
print("Freq:")
for ch in "0123456789":
    count =0
    for i in s:
        if i == ch:
            count+=1
    if count>0:
        print(ch, ":",count)