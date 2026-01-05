import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		/*
		 * 배수 => 나누었을 때 나머지가 0
		 * 각각의 배수 조건에 대해 if 조건문 걸면 됨
		 */
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}