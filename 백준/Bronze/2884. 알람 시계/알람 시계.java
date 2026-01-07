import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());	// 시간
		int M = Integer.parseInt(st.nextToken());	// 분
		
		if (M - 45 < 0) {
			if (H == 0) {
				H = 23;
			} else {
				H -= 1;
			}
			M += 15;
			
			bw.write(String.valueOf(H) + " " + String.valueOf(M));
		} else if (M - 45 >= 0) {
			M -= 45;
			
			bw.write(String.valueOf(H) + " " + String.valueOf(M));
		}
		
		bw.flush();
		bw.close();
	}
}

