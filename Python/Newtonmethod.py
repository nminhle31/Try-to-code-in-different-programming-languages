import math
a = int(input())
e = float(input())
x0 = (1 + a)/2
xN = (x0 + (a/x0))/2
while abs((xN - x0)/x0) >= e:
    x0 = xN
    xN = (x0 + (a/x0))/2
print(math.sqrt(pow(xN,2)))