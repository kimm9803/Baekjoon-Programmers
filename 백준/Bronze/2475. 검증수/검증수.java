import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");		
		
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += Math.pow(Integer.parseInt(st.nextToken()), 2);
		}
		
		int result = sum % 10;
		
		System.out.println(result);
	}
}