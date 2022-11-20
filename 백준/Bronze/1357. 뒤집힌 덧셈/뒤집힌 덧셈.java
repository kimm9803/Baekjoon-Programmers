import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String X = st.nextToken();
		String Y = st.nextToken();
		
		String rev_X = "";
		String rev_Y = "";
		
		String int_X = "";
		String int_Y = "";
		
		for (int i = X.length() - 1; i >= 0; i--) {
			rev_X += X.charAt(i);
		}
		
		for (int i = 0; i < rev_X.length(); i++) {
			if (rev_X.charAt(i) == '0') {
				if (int_X.isEmpty()) {
					continue;
				} else {
					int_X += rev_X.charAt(i);
				}
			} else {
				int_X += rev_X.charAt(i);
			}
		}
		
		for (int i = Y.length() - 1; i >= 0; i--) {
			rev_Y += Y.charAt(i);
		}
		
		for (int i = 0; i < rev_Y.length(); i++) {
			if (rev_Y.charAt(i) == '0') {
				if (int_Y.isEmpty()) {
					continue;
				} else {
					int_Y += rev_Y.charAt(i);
				}
			} else {
				int_Y += rev_Y.charAt(i);
			}
		}
		
		int result = Integer.parseInt(int_X) + Integer.parseInt(int_Y);
		
		String str_result = Integer.toString(result);
		String rev_str = "";
		for (int i = str_result.length() - 1; i >= 0; i--) {
			rev_str += str_result.charAt(i);
		}
		
		String finalResult = "";
		
		for (int i = 0; i < rev_str.length(); i++) {
			if (rev_str.charAt(i) == '0') {
				if (finalResult.isEmpty()) {
					continue;
				} else {
					finalResult += rev_str.charAt(i);
				}
			} else {
				finalResult += rev_str.charAt(i);
			}
		}

		System.out.println(finalResult);
	}
}