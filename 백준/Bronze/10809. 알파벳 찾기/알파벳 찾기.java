import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		String alphabet = new String("abcdefghijklmnopqrstuvwxyz");
		String str = new String();
		
		str = sc.nextLine();
		sc.close();
		
		for (int i = 0; i < alphabet.length(); i++) {
			int index = -1;
			for (int j = 0; j < str.length(); j++) {
				if (alphabet.charAt(i) == str.charAt(j)) {
					index = str.indexOf(alphabet.charAt(i));
				}
			}
			System.out.print(index + " ");
		}
	}	
}
	