import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());	// 듣도 못한 사람 수
		int m = Integer.parseInt(st.nextToken());	// 보도 못한 사람 수
		
		Set<String> hSet = new HashSet<>();		// 듣도 못한 사람 집합
		List<String> hList = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			hSet.add(br.readLine());
		}
		
		String str;
		int count = 0;
		
		for (int i = 0; i < m; i++) {
			str = br.readLine();
			
			if (hSet.contains(str)) {
				count++;
				hList.add(str);
			}
		}
		Collections.sort(hList);
		System.out.println(count);
		for (int i = 0; i < hList.size(); i++) {
			System.out.println(hList.get(i));
		}
		br.close();
	}
} 	