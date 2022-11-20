import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		isPrime[0] = isPrime[1] = false;	// 0과 1은 소수가 아니기 때문에 false로 초기화
		
		for (int i = 2; i*i <= n; i++) {
			if (isPrime[i]) {
				for (int j = i*i; j <= n; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		for (int i = m; i <= n; i++) {
			if (isPrime[i]) {
				sum += i;
				list.add(i);
			}
		}
		
		if (!list.isEmpty()) {
			System.out.println(sum);
			System.out.println(list.get(0));
		} else {
			System.out.println(-1);
		}
	}
}
