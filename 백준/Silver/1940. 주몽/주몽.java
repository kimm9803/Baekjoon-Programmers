import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 재료의 개수
        int m = Integer.parseInt(br.readLine());    // 두 재료를 합쳤을 때의 수
        int[] num = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        int end = 0;
        int sum = 0;
        int count = 0;

        for (int start = 0; start < n; start++) {
            sum = 0;
            end = start + 1;

            while (end < n) {
                sum = num[start];
                sum += num[end];
                end++;
                if (sum == m) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

