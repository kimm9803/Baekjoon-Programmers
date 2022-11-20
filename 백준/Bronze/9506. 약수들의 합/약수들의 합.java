import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == -1)	break;
			int sum = 0;
			
			for (int i = 1; i*i <= n; i++) {
				if (n % i == 0) {
					sum += i;
					list.add(i);
					
					if (i*i != n) {
						sum += (n / i);
						list.add(n/i);
					}
				}
			}
			sum -= n;
			Collections.sort(list);
			
			if (sum == n) {
				System.out.print(n + " = " + list.get(0));
				for (int i = 1; i < list.size() - 1; i++) {
					System.out.print(" + " + list.get(i));
				}
				System.out.println();
			}
			else {
				System.out.println(n + " is NOT perfect.");
			}
			list.clear();
		}
	}
}
