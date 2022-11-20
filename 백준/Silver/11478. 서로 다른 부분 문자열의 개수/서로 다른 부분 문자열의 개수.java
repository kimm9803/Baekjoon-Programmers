import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		Set<String> hSet = new HashSet<>();
		
		for(int i=0; i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				hSet.add(s.substring(i, j));
			}
		}
		
		System.out.println(hSet.size());
	}
}