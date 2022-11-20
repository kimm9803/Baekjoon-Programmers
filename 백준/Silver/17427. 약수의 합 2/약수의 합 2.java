import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i * (n / i);
		}
		System.out.println(sum);
	}
}
