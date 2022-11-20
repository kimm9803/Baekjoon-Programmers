import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		Integer[] arr_as = {1, 2, 3, 4, 5, 6, 7, 8};
		Integer[] arr_de = {8, 7, 6, 5, 4, 3, 2, 1};
		
		Integer[] arr = new Integer[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		if (Arrays.equals(arr, arr_as)) {
			System.out.println("ascending");
		} else if (Arrays.equals(arr, arr_de)) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}