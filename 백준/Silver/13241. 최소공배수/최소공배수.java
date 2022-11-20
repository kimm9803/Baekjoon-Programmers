import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		System.out.println(a * b /gcd(b, a));
	}
	
	public static long gcd(long a, long b) {
		long temp = 0;
		
		while (a % b != 0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		return b;
	}
}
