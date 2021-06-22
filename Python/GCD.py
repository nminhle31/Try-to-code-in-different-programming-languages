a = int(input("Input number a "))
b = int(input("Input number b "))
if a < 0: a *= -1
if b < 0: b *= -1
def gcd(a,b):
    if b == 0:
        return a
    else:
        return gcd(b,a%b)

print("GCD = ", gcd(a,b))