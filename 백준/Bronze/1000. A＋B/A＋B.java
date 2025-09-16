import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문자열 입력
		String str = br.readLine();
		// 문자열을 공백으로 분리
		StringTokenizer st = new StringTokenizer(str, " ");
		// 정수형으로 변환
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int result = a + b;
		
		System.out.println(result);
	}
}
