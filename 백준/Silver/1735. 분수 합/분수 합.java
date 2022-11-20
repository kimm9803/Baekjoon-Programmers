import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Fountain a = new Fountain(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		
		st = new StringTokenizer(br.readLine(), " ");
		Fountain b = new Fountain(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		
		int denominator = a.denominator * b.denominator;	// 분모
		int molecule = a.molecule * b.denominator + b.molecule * a.denominator;		// 분자
		
		int gcd = gcd(denominator, molecule);	// 최대공약수
		
		System.out.println(molecule / gcd + " " + denominator / gcd);
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

class Fountain {
	int molecule;		// 분자
	int denominator;	// 분모
	
	public Fountain(int molecule, int denominator) {
		this.molecule = molecule;
		this.denominator = denominator;
	}
}