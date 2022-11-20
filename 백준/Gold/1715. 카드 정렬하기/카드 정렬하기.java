import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int card = Integer.parseInt(br.readLine());	// 카드 갯수
			pq.add(card);
		}
		
		int sum = 0;
		
		while (pq.size() > 1) {
			int temp1 = pq.poll();
			int temp2 = pq.poll();
			
			sum += temp1 + temp2;
			pq.add(temp1 + temp2);
		}
		System.out.println(sum);
	}
}