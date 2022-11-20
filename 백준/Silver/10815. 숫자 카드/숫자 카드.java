import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 상근이가 가지고 있는 숫자 카드 개수
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		Set<Integer> card = new HashSet<>();
		for (int i = 0; i < n; i++) {
			card.add(Integer.parseInt(st.nextToken()));
		}
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < m; i++) {
			if (card.contains(Integer.parseInt(st.nextToken()))) {
				System.out.print(1 + " ");
			} else {
				System.out.print(0 + " ");
			}
		}
		br.close();
	}
} 	