import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		if (n == 2) {
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			for (int i = 1; i <= Math.min(a, b); i++) {
				if (a % i == 0 && b % i == 0) {
					System.out.println(i);
				}
			}
		} else {
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			for (int i = 1; i <= Math.min(a, Math.min(b, c)); i++) {
				if (a % i == 0 && b % i == 0 && c % i ==0) {
					System.out.println(i);
				}
			}
		}
		br.close();
	}
}
