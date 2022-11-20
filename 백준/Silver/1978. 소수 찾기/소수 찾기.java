import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				result++;
			}
		}
		System.out.println(result);
	}
}