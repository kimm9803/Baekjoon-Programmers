import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = i;
            String str = Integer.toString(i);
            for (int j = 0; j < str.length(); j++) {
                sum += str.charAt(j) - '0';
            }

            if (sum == n) {
                System.out.println(i);
                break;
            } else {
                sum = 0;
            }
        }
        if (sum == 0) {
            System.out.println(0);
        }
    }
}