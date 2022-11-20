import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		boolean[] isPrime = new boolean[n + 1];
		List<Integer> list = new ArrayList<>();
		
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		
		for (int i = 2; i <= n; i++) {
			
			if (isPrime[i]) {
				for (int j = i; j <= n; j+=i) {
					isPrime[j] = false;
					
					if (list.contains(j) == false) {
						list.add(j);
					}
				}
			}
		}
		
		System.out.println(list.get(k-1));
	}
}