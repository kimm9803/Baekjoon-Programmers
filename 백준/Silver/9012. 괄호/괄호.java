import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	String str;
    	for (int i = 0; i < n; i++) {
    		str = br.readLine();
    		System.out.println(solve(str));
    	}
    }
    
    public static String solve(String str) {
    	Stack<String> stack = new Stack<>();
    	
    	for (int i = 0; i < str.length(); i++) {
    		if (str.charAt(i) == '(') {
    			stack.push("(");
    		} else if (str.charAt(i) == ')' && stack.empty()) {
    			return "NO";
    		} else {
    			stack.pop();
    		}
    	}
    	
    	if (stack.empty()) {
    		return "YES";
    	} else {
    		return "NO";
    	}
    }
}