import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());    // 테스트 케이스 수
        String str; // 동전수열
        for (int i = 0; i < t; i++) {
            str = br.readLine();
            int[] arr = new int[8];
            Arrays.fill(arr, 0);
            String coin;
            int count = 0;
            // 동전수열 탐색
            for (int j = 0; j < str.length() - 2; j++) {
                coin = "";
                coin += str.charAt(j);
                coin += str.charAt(j+1);
                coin += str.charAt(j+2);

                if (coin.equals("TTT")) {
                    arr[0]++;
                } else if (coin.equals("TTH")) {
                    arr[1]++;
                } else if (coin.equals("THT")) {
                    arr[2]++;
                } else if (coin.equals("THH")) {
                    arr[3]++;
                } else if (coin.equals("HTT")) {
                    arr[4]++;
                } else if (coin.equals("HTH")) {
                    arr[5]++;
                } else if (coin.equals("HHT")) {
                    arr[6]++;
                } else if (coin.equals("HHH")) {
                    arr[7]++;
                }
            }

            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}