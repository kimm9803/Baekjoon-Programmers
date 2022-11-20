import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(hansoo(n));
	}
	
	public static int hansoo(int n) {
		
		int count = 0;
		
		if (n < 100) {
			return n;
		} else {
			count = 99;
			
			for (int i = 100; i <= n; i++) {
				int hundread = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				
				if ((hundread - ten) == (ten - one)) {
					count++;
				}
			}
		}
		
		return count;
	}
}
