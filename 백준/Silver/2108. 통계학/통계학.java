import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		double sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		System.out.println(Math.round(sum/n));
		
		Arrays.sort(arr);
		
		int min_index = 0;
		int max_index = arr.length - 1;
		
		int mid = (max_index - min_index) / 2;
		System.out.println(arr[mid]);
		
		int mode = arr[0];
		int count = 0;
		int max = -1;
		boolean check = false;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i+1]) {
				count++;
			}
			else {
				count = 0;
			}
			
			if (max < count) {
				max = count;
				mode = arr[i];
				check = true;
			} 
			else if (max == count && check == true) {
				mode = arr[i];
				check = false;
			}
		}
		
		System.out.println(mode);
		System.out.println(arr[n-1] - arr[0]);
	}
}