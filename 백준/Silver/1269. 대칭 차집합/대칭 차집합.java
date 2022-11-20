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
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		Set<Integer> aSet = new HashSet<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < a; i++) {
			aSet.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int asum = a;
		int bsum = b;
		int result = 0;
		for (int i = 0; i < b; i++) {
			if (aSet.contains(Integer.parseInt(st.nextToken()))) {
				asum--;
				bsum--;
			}
		}
		result = asum + bsum;
		
		System.out.println(result);
		br.close();
	}
} 	