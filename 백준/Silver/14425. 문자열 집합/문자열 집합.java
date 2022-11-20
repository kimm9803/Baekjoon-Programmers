import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());	// 집합에 포함되는 문자열
		int m = Integer.parseInt(st.nextToken());	// 입력으로 주어지는 문자열
		
		Set<String> hSet = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			hSet.add(br.readLine());		// 집합
		}
		
		String str;
		int sum = 0;
				
		for (int i = 0; i < m; i++) {
			str = br.readLine();
			if (hSet.contains(str)) {
				sum++;
			}
		}
		System.out.println(sum);
		br.close();
	}
} 	