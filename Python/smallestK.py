n = int(input("Input n: "))
k = 0
if n != 1:
    while pow(2,k) < n:
        k += 1
    print(k)
else:
    print(k)