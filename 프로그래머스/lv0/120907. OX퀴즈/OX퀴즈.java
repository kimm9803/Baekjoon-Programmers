import java.util.StringTokenizer;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        StringTokenizer st;
        for (int i = 0; i < quiz.length; i++) {
            st = new StringTokenizer(quiz[i], " ");
            int a = Integer.parseInt(st.nextToken());
            String pl = st.nextToken();
            int b = Integer.parseInt(st.nextToken());
            String eqol = st.nextToken();
            int result = Integer.parseInt(st.nextToken());
            if (pl.equals("+")) {
                if (a + b == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (pl.equals("-")) {
                if (a - b == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}