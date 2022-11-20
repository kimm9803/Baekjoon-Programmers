import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		int[] arr = new int[alphabet.length()];
		
		String str;
		String s = "";
		while ((str = br.readLine()) != null) {
			s += str;
		}
		
		for (int i = 0; i < alphabet.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (alphabet.charAt(i) == s.charAt(j)) {
					arr[i]++;
				}
			}
		}
		
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i]) {
				System.out.print(alphabet.charAt(i));
			}
		}
	}
} 