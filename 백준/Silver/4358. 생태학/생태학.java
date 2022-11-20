import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		String tree;
		int count = 0;
		while(true) {
			tree = br.readLine();
			
			if(tree == null || tree.equals("")) {
				break;
			}
			
			count++;
			if (!map.containsKey(tree)) {
				map.put(tree, 1);
			} else {
				map.put(tree, map.get(tree) + 1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		double value = 0;
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			value = (double) (map.get(key) * 100.0) / count;
			
			bw.write(key + " " + String.format("%.4f", value) + "\n");
		}
		bw.flush();
		bw.close();
	}
}
