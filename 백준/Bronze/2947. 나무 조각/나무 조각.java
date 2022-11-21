import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[5];
        int[] arr_o = {1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while(true) {
            int i = 0;
            for (i = 0; i < 4; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " ");
                }
            }

            if (arr[0] == arr_o[0] && arr[1] == arr_o[1] && arr[2] == arr_o[2] && arr[3] == arr_o[3] && arr[4] == arr_o[4]) {
                break;
            }
        }
    }
}