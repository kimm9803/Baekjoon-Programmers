import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] arr = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i, str.length());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }
}