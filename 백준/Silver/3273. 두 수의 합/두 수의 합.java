import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int end = 0;
        int sum = 0;
        int count = 0;
        for (int start = 0; start < n; start++) {
            end = start + 1;
            sum = 0;

            while (end < n) {
                sum = arr[start] + arr[end++];

                if (sum == x) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

