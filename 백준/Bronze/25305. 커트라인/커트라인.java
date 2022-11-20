import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());	// 응시자 수
		int k = Integer.parseInt(st.nextToken());	// 상을 받는 사람 수
		
		st = new StringTokenizer(br.readLine(), " ");
		
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println(arr[k-1]);
		br.close();
	}
}