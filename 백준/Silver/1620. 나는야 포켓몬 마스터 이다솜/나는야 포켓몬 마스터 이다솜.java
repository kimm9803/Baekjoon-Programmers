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
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			map.put(s, i + 1);
			str[i] = s;
		}
		
		for (int i = 0; i < m; i++) {
			String input = br.readLine();
			if (map.containsKey(input)) {
				System.out.println(map.get(input));
			}
			else {
				int num = Integer.parseInt(input);
				System.out.println(str[num - 1]);
			}
		}
		br.close();
	}
}