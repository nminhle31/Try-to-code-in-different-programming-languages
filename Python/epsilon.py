e = float(input("Enter number: "))
n = 0
pi = 0.0
t = 4/(2*n+1)
while t > e:
    if n % 2 == 0:
        pi += t
    else:
        pi -= t
    n += 1
    t = 4/(2*n+1)
print(round(pi,2))
