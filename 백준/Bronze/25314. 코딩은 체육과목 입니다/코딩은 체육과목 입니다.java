import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		for (int i = 0; i < a / 4; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
}