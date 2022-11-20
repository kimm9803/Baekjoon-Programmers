import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	while (true) {
    		int n = Integer.parseInt(br.readLine());
    		
    		if (n == 0)		break;
    		
    		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    		
    		Integer[] arr = new Integer[n];
    		for (int i = 0; i < n; i++) {
    			arr[i] = Integer.parseInt(st.nextToken());
    		}
    		
    		Arrays.sort(arr, Collections.reverseOrder());
    		
    		int[] difference = new int[n-1];
    		
    		for (int i = 0; i < n-1; i++) {
    			difference[i] = arr[i] - arr[i+1];
    		}
    		
    		Arrays.sort(difference);
    		
    		System.out.println(difference[0]);
    	}
    }
}
