import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
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
		
		ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (isPrime[i]) {
            	arr.add(i);
            }
        }

        int sum = 0;
        int start = 0, end = 0, count = 0;
        while (true) {
            if (sum >= n) {
            	sum -= arr.get(start++);
            }
            else if (end == arr.size()) {
            	break;
            }
            else {
            	sum += arr.get(end++);
            }

            if (sum == n) {
            	count++;
            }
        }

        System.out.println(count);
	}
}
