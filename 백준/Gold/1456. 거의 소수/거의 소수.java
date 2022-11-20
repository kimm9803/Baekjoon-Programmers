import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long m = Long.parseLong(st.nextToken());
		long n = Long.parseLong(st.nextToken());
		int max = 10000000;
		
		boolean[] isPrime = new boolean[max + 1];
		
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		
		for (int i = 2; i*i <= max; i++) {
			if (isPrime[i]) {
				for (int j = i*i; j <= max; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		int count = 0;
		
		for (int i = 2; i <= max; i++) {
			double result = 1;
			
			if (isPrime[i]) {
				result = i;
				while (true) {
					result *= i;
					
					if (result >= m && result <= n) {
						count++;
					}
					if (result > n)	break;
				}
			}
		}
		System.out.println(count);
	}
}