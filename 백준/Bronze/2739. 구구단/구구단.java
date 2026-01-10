import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 9; i++) {
			sb.append(N).append(" * ").append(i).append(" = ").append(N * i);
			if (i != 9)	sb.append("\n");
		}
		
		System.out.print(sb);
	}
}

