import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int k = Integer.parseInt(st.nextToken()); // 소지 랜턴 개수
		int n = Integer.parseInt(st.nextToken()); // 필요 랜턴 개수
		
		long[] arr = new long[k];
		long max = 0;
		
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(upperBound(arr, n, max));
		br.close();
	}
	
	public static long upperBound(long[] arr, int n, long max) {
		long min = 1;
		long mid = 0;
		
		while (min <= max) {
			mid = (min + max) / 2;
			long count = 0;
			
			for (int i = 0; i < arr.length; i++) {
				count += arr[i] / mid;
			}
			
			if (count < n) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
		}
		return min - 1;
	}
}