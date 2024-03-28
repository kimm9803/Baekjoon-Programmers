import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine());
			
			if (k == 0) {
				stack.pop();
			} else {
				stack.push(k);
			}
		}
		
		int sum = 0;
		while (!stack.empty()) {
			sum += stack.peek();
			stack.pop();
		}
		System.out.println(sum);
		br.close();
	}
}