
public class Main {
	
	public static int d(int n) {
		
		int result = 0;
		int sum = 0;
		
		String str = Integer.toString(n);
		
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		
		result = sum + n;
		
		return result;
	}
	
	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		
		for (int i = 1; i <= 10000; i++) {
			int n = d(i);
			
			if (n <= 10000) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 10000; i++) {
			
			if (!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
}