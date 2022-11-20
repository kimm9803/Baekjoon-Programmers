import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken()); // 나무의 개수
		int m = Integer.parseInt(st.nextToken()); // 필요 나무 길이
		
		int[] tree = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < n; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = 0;
		int max = 0;
		
		Arrays.sort(tree);
		 
		max = tree[n - 1];
		
		while (min < max) {
			int mid = (min + max) / 2;
			long sum = 0;
			
			for (int i = 0; i < tree.length; i++) {
				if (tree[i] - mid > 0) {
					sum += (tree[i] - mid);
				}
			}
			
			if (sum < m) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
		}
		System.out.println(min - 1);
	}
}