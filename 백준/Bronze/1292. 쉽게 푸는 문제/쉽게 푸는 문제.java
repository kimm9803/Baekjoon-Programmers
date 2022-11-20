import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(result(a, b));
		br.close();
	}
	
	public static int result(int a, int b) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= 1000; i++) {
			for (int j = 0; j < i; j++)
			{
				list.add(i);
			}
		}
		
		int sum = 0;
		for (int i = a - 1; i <= b - 1; i++) {
			sum += list.get(i);
		}
		return sum;
	}
} 