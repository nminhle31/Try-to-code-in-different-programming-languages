import java.util.Scanner;

public class simplearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

}
