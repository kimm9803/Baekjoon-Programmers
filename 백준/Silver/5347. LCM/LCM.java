import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < t; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    		
    		long x = Long.parseLong(st.nextToken());
    		long y = Long.parseLong(st.nextToken());
    		
    		if (x > y) {
    			long gcd = gcd(x, y);
    			long result = x * y / gcd;
    			
    			System.out.println(result);
    		} else {
    			long gcd = gcd(y, x);
    			long result = x * y / gcd;
    			
    			System.out.println(result);
    		}
    	}
    	
    }
    
    public static long gcd(long a, long b) {
    	long temp = 0;
    	
    	while (b != 0) {
    		temp = a % b;
    		a = b;
    		b = temp;
    	}
    	return a;
    }
}
