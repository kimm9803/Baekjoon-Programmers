import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr_n = new int[n];
		int[] arr_sum = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr_n[i] = Integer.parseInt(st.nextToken());
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = 0;
			
			for (int j = 0; j < n; j++) {
				sum += Math.abs(arr_n[i] - arr_n[j]);
			}
			arr_sum[i] = sum;
		}
		
		int min = 2100000000;
		for (int i = 0; i < n; i++) {
			if (arr_sum[i] < min) {
				min = arr_sum[i];
			}
		}
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (min == arr_sum[i]) {
				list.add(arr_n[i]);
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0));
	}
}