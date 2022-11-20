import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int first = 666;
		
		while(true) {
			String str = String.valueOf(first);
			
			for (int i = 0; i < str.length() - 2; i++) {
				if (str.charAt(i) == '6' && str.charAt(i+1) == '6' && str.charAt(i+2) == '6') {
					n--;
					break;
				}
			}
			
			if (n == 0) break;
			first++;
		}
		System.out.println(first);
	}
}