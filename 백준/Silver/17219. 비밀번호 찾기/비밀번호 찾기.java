import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());	// 사이트 주소 수
		int m = Integer.parseInt(st.nextToken());	// 찾으려는 사이트 주소 수
		
		Map<String, String> map = new HashMap<String, String>();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken());
		}
		
		for (int i = 0; i < m; i++) {
			String str = br.readLine();
			System.out.println(map.get(str));
		}
		br.close();
	}
}