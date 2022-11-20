import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < n - 1; i++) {
			int b = Integer.parseInt(st.nextToken());
			
			int c = gcd(a, b); // 최대공약수
			
			System.out.println(a / c + "/" + b / c);
		}
		br.close();
	}
	
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			
			a = b;
			b = r;
		}
		return a;
	}
} 