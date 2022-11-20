import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = Integer.parseInt(br.readLine()); // 총 금액
		int n = Integer.parseInt(br.readLine()); // 물건의 종류수
		
		StringTokenizer st;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sum += a * b;
		}
		
		if (total == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		br.close();
	}
}