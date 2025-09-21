import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		
		int intA = Integer.parseInt(a);
		int intB = Integer.parseInt(b);
		
		for (int i = b.length() - 1; i >= 0; i--) {
			System.out.println(intA * Integer.parseInt(String.valueOf(b.charAt(i))));
		}
		System.out.println(intA * intB);
	}
}
