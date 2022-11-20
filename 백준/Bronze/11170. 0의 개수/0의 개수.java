import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int count = 0;
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			for (int j = n; j <= m; j++) {
				int temp = j;
				
				if (temp == 0) {
					count++;
					continue;
				}
				
				while (temp > 0) {
					if (temp % 10 == 0) {
						count++;
					}
					temp /= 10;
				}
			}
			System.out.println(count);
		}

	}
}