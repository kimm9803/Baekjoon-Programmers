import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());	// 바구니 개수
		int m = Integer.parseInt(st.nextToken());	// 공을 바꿀 횟수
		
		int[] arr = new int[n];
		// 배열에 바구니 번호 초기화
		for (int i = 0; i < n; i++) {
			arr[i] = i+1;
		}
		
		for (int k = 0; k < m; k++) {
			st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int temp = 0;
			
			temp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = temp;
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
			
	}
}