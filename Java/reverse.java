import java.util.Scanner;

public class reverse {
	public static void reverseNumber(int n) {
		while (n!=0) {
			System.out.print(n%10);
			n /= 10;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		reverseNumber(n);
				

	}

}
