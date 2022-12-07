import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String str;
        for (int i = 0; i < t; i++) {
            str = br.readLine();
            System.out.print(Character.toString(str.charAt(0)) + Character.toString(str.charAt(str.length()-1)));
            System.out.println();
        }
    }
}