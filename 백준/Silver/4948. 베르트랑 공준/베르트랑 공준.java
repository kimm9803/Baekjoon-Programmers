import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			
			if (n == 0) {
				break;
			}
			
			boolean[] isPrime = new boolean[(2*n) + 1];
			Arrays.fill(isPrime, true);
			isPrime[0] = isPrime[1] = false;
			
			for (int i = 2; i*i <= 2*n; i++) {
				
				if (isPrime[i]) {
					for (int j = i*i; j <= 2*n; j+=i) {
						isPrime[j] = false;
					}
				}
			}
			
			for (int i = n+1; i <= 2*n; i++) {
				if (isPrime[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}