import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		solve(n, k);
	}

	public static void solve(int n, int k) {
		Queue<Integer> queue = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		
		while (!queue.isEmpty()) {
			for (int i = 0; i < k-1; i++) {
				int num = queue.poll();
				queue.offer(num);
			}
			list.add(queue.poll());
		}
		
		System.out.print("<");
		for (int i = 0; i < list.size() - 1; i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.print(list.get(list.size()-1) + ">");
	}

}