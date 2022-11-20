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
		
		long result = gcd(a, b);	// a와 b의 최대공약수
		String str = "";
		
		str = "1".repeat((int)result);
		
		System.out.println(str);
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
