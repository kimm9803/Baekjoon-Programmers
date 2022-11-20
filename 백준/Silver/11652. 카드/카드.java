import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Map<Long, Integer> map = new HashMap<Long, Integer>();
		
		for (int i = 0; i < n; i++) {
			long key = Long.parseLong(br.readLine());
			
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		
		int max = 0;
		long result = 0;
		for (long a : map.keySet()) {
			if (map.get(a) > max) {
				max = map.get(a);
				result = a;
			} 
			else if (map.get(a) == max) {
				result = Math.min(result, a);
			}
		}
		System.out.println(result);
	}
}