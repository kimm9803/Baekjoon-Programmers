import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		/*
		 * 버퍼라는 임시 메모리 공간에 모아두었다가 한 덩어리로 가져옴
		 * System.in => 바이트 단위로 데이터를 읽음
		 * InputStreamReader => 바이트 데이터를 문자 데이터로 변환해줌
		 * 변환된 문자를 버퍼에 담아 속도를 높이고, readLine()기능을 제공
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		/*
		 *  문자열의 형태로 두 정수 A와 B를 입력
		 *  ex) 1 2
		 */
		String str = br.readLine();
		
		// 문자열을 하나씩 꺼내쓸 때 사용
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if (A > B) {
			bw.write(">");
		} else if (A < B) {
			bw.write("<");
		} else {
			bw.write("==");
		}
		
		// 버퍼 안에 남은 데이터를 털어냄
		bw.flush();
		bw.close();
	}
}
