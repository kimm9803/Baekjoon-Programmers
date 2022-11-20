import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine(), ":");
    	
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	
    	if (n > m) {
    		int gcd = gcd(n, m);
    		
    		System.out.print(n / gcd + ":" + m / gcd);
    	} else {
    		int gcd = gcd(m, n);
    		
    		System.out.print(n / gcd + ":" + m / gcd);
    	}
    }
    
    public static int gcd(int a, int b) {
    	int temp = 0;
    	
    	while (b != 0) {
    		temp = a % b;
    		a = b;
    		b = temp;
    	}
    	return a;
    }
}
