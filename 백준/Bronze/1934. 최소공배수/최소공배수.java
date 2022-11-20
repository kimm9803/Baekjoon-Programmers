import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int c = gcd(a, b);
			
			System.out.println(a * b / c);
		}
		br.close();
	}
	
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			
			// GCD(a, b) = GCD(b, r)
			a = b;
			b = r;
		}
		return a;
	}
} 