#include <stdio.h>
int hcf(int n1, int n2);
int main() {
    int a1, a2;
    scanf("%d %d", &a1, &a2);
    printf("G.C.D = %d ",gcd(a1, a2));
    return 0;
}

int gcd(int a1, int a2) {
    if (a2 == 0) return a1;
    return gcd(a2, a1 % a2);
}

