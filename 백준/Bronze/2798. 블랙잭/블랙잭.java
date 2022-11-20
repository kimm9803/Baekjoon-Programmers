import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i+1; j < n - 1; j++) {
				for (int k = j+1; k < n; k++) {
					sum = arr[i] + arr[j] + arr[k];
					
					if (sum <= m) {
						list.add(sum);
					}
					sum = 0;
				}
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(list.size() - 1));
	}
}