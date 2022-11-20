import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int t = Integer.parseInt(br.readLine());	// 테스트 케이스 수
    	
    	for (int i = 0; i < t; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    		
    		int n = Integer.parseInt(st.nextToken());
    		
    		Integer[] arr = new Integer[n];
    		for (int j = 0; j < n; j++) {
    			arr[j] = Integer.parseInt(st.nextToken());
    		}
    		
    		Arrays.sort(arr, Collections.reverseOrder());
    		
    		long sum = 0;
    		for (int j = 0; j < n-1; j++) {
    			
    			for (int k = j + 1; k < n; k++) {
    				sum += gcd(arr[j], arr[k]);
    			}
    		}
    		System.out.println(sum);
    	}
    }
    
    // 유클리드 호제법(최대공약수)
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