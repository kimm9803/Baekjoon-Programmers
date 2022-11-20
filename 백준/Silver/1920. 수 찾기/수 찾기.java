import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			if (binarySearch(arr, key) >= 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
	
	public static int binarySearch(int[] arr, int key) {
		int lo = 0;	// 탐색 구간의 맨왼쪽 인덱스
		int hi = arr.length - 1; // 탐색 구간의 맨오른쪽 인덱스
		
		while (lo <= hi) {
			int middle = (lo + hi) / 2; // 탐색구간 중간 인덱스
			
			if (key < arr[middle]) {
				hi = middle - 1;
			}
			else if (key > arr[middle]) {
				lo = middle + 1;
			}
			else {
				return middle;
			}
		}
		return -1;
	}
}
