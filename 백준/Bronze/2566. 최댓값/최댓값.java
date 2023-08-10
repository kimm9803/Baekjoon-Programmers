import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str = "";
        int row = 0, col = 0;    // 행, 열
        int mrow = 0, mcol = 0; // 최댓값의 행, 열
        int max = 0;
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                if (max < num) {
                    max = num;
                    mrow = row;
                    mcol = col;
                }
                col++;
            }
            row++;
            col = 0;
        }

        System.out.println(max);
        System.out.println((mrow + 1) + " " + (mcol + 1));
    }
}

