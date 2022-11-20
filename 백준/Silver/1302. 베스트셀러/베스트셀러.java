import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}
		
		int max = 0;
		for (String s : map.keySet()) {
			if (map.get(s) > max) {
				max = map.get(s);
			}
		}
		
		List<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list);
		
		for (String s : list) {
			if (map.get(s) == max) {
				System.out.println(s);
				break;
			}
		}
	}
}
