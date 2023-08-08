import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0.0;   // 학점 총합
        String name;        // 과목 이름
        double credit;      // 학점
        String score;       // 과목평점
        double result = 0.0;      // 학점 * 과목평점
        StringTokenizer st;
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            name = st.nextToken();
            credit = Double.parseDouble(st.nextToken());
            score = st.nextToken();
            sum += credit;

            switch (score) {
                case "A+":  result += (credit * 4.5);   break;
                case "A0":  result += (credit * 4.0);   break;
                case "B+":  result += (credit * 3.5);   break;
                case "B0":  result += (credit * 3.0);   break;
                case "C+":  result += (credit * 2.5);   break;
                case "C0":  result += (credit * 2.0);   break;
                case "D+":  result += (credit * 1.5);   break;
                case "D0":  result += (credit * 1.0);   break;
                case "P" :  sum    -= credit;           break;
                case "F" :                              break;
            }
        }

        System.out.println(String.format("%.6f", result / sum));
    }
}

