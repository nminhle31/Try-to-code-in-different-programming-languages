#include <stdio.h>
void countNumber(int n){
	int cnt = 0;
	while (n != 0) {
		n /= 10;
		cnt++;
	}
	printf("%d",cnt);
}
int main(){
	int n;
	scanf("%d", &n);
	countNumber(n);
	return 0;
	
}
