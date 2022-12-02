import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String lower = str.toLowerCase();
        String upper = str.toUpperCase();

        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == lower.charAt(i)) {
                System.out.print(upper.charAt(i));
            } else if (c == upper.charAt(i)) {
                System.out.print(lower.charAt(i));
            }
        }
    }
}