import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		BigInteger a = new BigInteger("1");
		
		for (int i = n; i > 0; i--) {
			a = a.multiply(BigInteger.valueOf(i));
		}
		
		String str = a.toString();
		long count = 0;
		for (int i = str.length() - 1; i >= 0 ; i--) {
			if ((str.charAt(i) - '0') == 0) {
				count++;
			} else {
				break;
			}
		}
		
		System.out.println(count);
		br.close();
	}
	
}