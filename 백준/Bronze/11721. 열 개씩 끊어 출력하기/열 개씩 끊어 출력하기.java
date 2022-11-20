import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		List<Character> list = new ArrayList<>();
		
		for (int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
			
			if (list.size() == 10) {
				for (int j = 0; j < 10; j++) {
					char c = list.get(j);
					System.out.print(c);
				}
				System.out.println();
				list.clear();
			}
		}
		
		for (int j = 0; j < list.size(); j++) {
			System.out.print(list.get(j));
		}
	}
}