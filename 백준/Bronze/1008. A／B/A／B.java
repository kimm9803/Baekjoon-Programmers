import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		double result = a / b;

		System.out.println(result);
	}
}
