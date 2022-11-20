import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		
		for (int i = 2; i*i <= n; i++) {
			if (isPrime[i]) {
				for (int j = i*i; j <= n; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		for (int i = m; i <= n; i++) {
			if (isPrime[i]) {
				System.out.println(i);
			}
		}
	}
}