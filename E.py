numbers=[]
n = int(input("Enter a number of files:"))
for i in range(n):
    num=int(input("Enter a number:"))
    numbers.append(num)
file = open("even_number.txt","w")
for n in numbers:
    if n%2==0:
        file.write(str(n)+"\n")
file.close
print("Even number file is saved")