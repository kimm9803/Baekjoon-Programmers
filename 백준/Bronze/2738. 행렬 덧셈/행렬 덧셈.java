import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		// 행렬 a
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for (int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		// 행렬 b
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for (int j = 0; j < m; j++) {
				b[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + b[i][j] + " ");
			}
			System.out.println();
		}
	}

}
