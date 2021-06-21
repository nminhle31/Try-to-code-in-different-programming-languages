def reverse(n):
    while n != 0 :
        print(n%10,end = '')
        n //= 10;

n = int(input())
reverse(n)