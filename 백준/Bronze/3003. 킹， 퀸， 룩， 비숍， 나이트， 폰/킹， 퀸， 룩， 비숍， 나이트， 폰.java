import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] c_arr = new int[] {1, 1, 2, 2, 2, 8};
		int[] d_arr = new int[6];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < 6; i++) {
			d_arr[i] = Integer.parseInt(st.nextToken());
			
			System.out.print(c_arr[i] - d_arr[i] + " ");
		}
	}
}