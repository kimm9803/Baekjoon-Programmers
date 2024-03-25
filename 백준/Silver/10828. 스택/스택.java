import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			String[] arr = str.split(" ");
			
			String order = arr[0];
			if (order.equals("push")) {
				stack.push(Integer.parseInt(arr[1]));
			} else if (order.equals("top")) {
				if (stack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.peek());
				}
			} else if (order.equals("size")) {
				System.out.println(stack.size());
			} else if (order.equals("empty")) {
				if (stack.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (order.equals("pop")) {
				if (stack.isEmpty()) {
					System.out.println(-1);
				} else {
					int pop = stack.pop();
					System.out.println(pop);
				}
			}
		}
	}
}
