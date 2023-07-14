import java.util.StringTokenizer;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        StringTokenizer st = new StringTokenizer(binomial, " ");
        
        String stra = st.nextToken();
        String op = st.nextToken();
        String strb = st.nextToken();
        
        if (op.equals("+")) {
            answer = Integer.parseInt(stra) + Integer.parseInt(strb);
        } else if (op.equals("-")) {
            answer = Integer.parseInt(stra) - Integer.parseInt(strb);
        } else {
            answer = Integer.parseInt(stra) * Integer.parseInt(strb);
        }
        return answer;
    }
}