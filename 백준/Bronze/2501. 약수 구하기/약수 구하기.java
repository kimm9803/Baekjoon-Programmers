import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean tr = false;
		
		
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
			if (count == k) {
				System.out.println(i);
				tr = true;
				break;
			}
		}
		
		if (tr == false) {
			System.out.println(0);
		}
	}

}
