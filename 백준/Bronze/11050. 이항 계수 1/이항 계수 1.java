import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		System.out.println(factorial(n) / (factorial(k) * factorial(n - k)));
	}
	
	public static int factorial(int m) {
		int result = 1;
		for (int i = m; i > 0; i--) {
			result *= i;
		}
		return result;
	}
} 	