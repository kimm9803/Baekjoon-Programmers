import java.util.StringTokenizer;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringTokenizer st = new StringTokenizer(my_string, " ");
        String pl = ""; // 연산자
        answer += Integer.parseInt(st.nextToken()); // 첫번째 토큰을 먼저 집어넣어줌
        
        while(st.countTokens() > 0) {
            String str = st.nextToken();
            
            if (str.equals("+") == true) {
                pl = "+";
            } else if (str.equals("-") == true) {
                pl = "-";
            } else {
                if (pl.equals("+")) {
                    answer += Integer.parseInt(str);
                } else if (pl.equals("-")) {
                    answer -= Integer.parseInt(str);
                }
            }
        }
        return answer;
    }
}