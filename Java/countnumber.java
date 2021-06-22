
import java.util.Scanner;

public class countnumber {
	public static void cntNumber(int n) {
		int cnt = 0;
		while (n!=0) {
			cnt++;
			n /= 10;
		}
		System.out.print(cnt);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		cntNumber(n);
				

	}

}
