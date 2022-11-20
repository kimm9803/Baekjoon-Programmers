import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[15][15];
		for (int i = 0; i < 15; i++) {
			arr[i][1] = 1;
			arr[0][i] = i;
		}
		
		for (int i = 1; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				arr[i][j] = arr[i][j-1] + arr[i-1][j];
			}
		}
		
		int t = Integer.parseInt(br.readLine());	// 테스트 케이스
		
		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			System.out.println(arr[k][n]);
		}
		br.close();
	}
} 	