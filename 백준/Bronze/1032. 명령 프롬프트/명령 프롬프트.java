import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 파일 이름의 갯수
		
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}
		
		
		for (int i = 0; i < str[0].length(); i++) {
			boolean tr = false;
			
			if (n == 1) {
				System.out.println(str[0]);
				break;
			}
			
			for (int j = 0; j < n - 1; j++) {
				if (str[0].charAt(i) == str[j+1].charAt(i)) {
					tr = true;
				} else {
					tr = false;
					break;
				}
			}
			
			if (tr == true) {
				System.out.print(str[0].charAt(i));
			} else {
				System.out.print("?");
			}
		}
	}
} 