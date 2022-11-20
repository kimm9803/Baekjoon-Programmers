import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.Math;

public class Main {
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (a == 0 && b == 0 && c ==0) {
				break;
			}
			
			if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2) ) {
				System.out.println("right");
			} else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2) ) {
				System.out.println("right");
			} else if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2) ) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}