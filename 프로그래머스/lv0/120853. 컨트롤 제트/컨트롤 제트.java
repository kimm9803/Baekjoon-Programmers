import java.util.StringTokenizer;

class Solution {
    public int solution(String s) {
        int answer = 0;
        StringTokenizer st = new StringTokenizer(s, " ");
        String str = "";
        int temp = Integer.parseInt(st.nextToken());
        answer += temp;
        
        while (st.countTokens() > 0) {
            str = st.nextToken();
            
            if (str.equals("Z") == true) {
                answer -= temp;
            } else {
                temp = Integer.parseInt(str);
                answer += Integer.parseInt(str);
            }
        }
        return answer;
    }
}