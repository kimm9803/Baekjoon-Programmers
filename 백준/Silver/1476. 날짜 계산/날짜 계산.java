import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int e = Integer.parseInt(st.nextToken());	// 지구
		int s = Integer.parseInt(st.nextToken());	// 태양
		int m = Integer.parseInt(st.nextToken());	// 달
		
		// 비교를 위한 변수
		int earth = 1, sun = 1, moon = 1;
		int year = 1;
		
		while (true) {
			
			if (e == 1 && s == 1 && m == 1) {
				System.out.println(1);
				break;
			}
			
			if (earth < 15) {
				earth++;
			} else {
				earth = 1;
			}
			
			if (sun < 28) {
				sun++;
			} else {
				sun = 1;
			}
			
			if (moon < 19) {
				moon++;
			} else {
				moon = 1;
			}
			
			year++;
			
			if (earth == e && sun == s && moon == m) {
				System.out.println(year);
				break;
			}
		}
	}
}