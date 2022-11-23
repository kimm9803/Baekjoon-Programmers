import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            int[] arr = new int[5];
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int[] result = new int[3];
            int sum = 0;
            for (int j = 1; j < 4; j++) {
                result[j-1] = arr[j];
                sum += result[j-1];
            }

            if (result[2] - result[0] >= 4) {
                System.out.println("KIN");
            } else {
                System.out.println(sum);
            }
        }
    }
}