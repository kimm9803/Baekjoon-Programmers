class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String stra = String.valueOf(a);
        String strb = String.valueOf(b);
        
        String strab = stra + strb;
        String strba = strb + stra;
        
        if (Integer.parseInt(strab) >= Integer.parseInt(strba)) {
            answer = Integer.parseInt(strab);
        } else if (Integer.parseInt(strab) < Integer.parseInt(strba)) {
            answer = Integer.parseInt(strba);
        }
        return answer;
    }
}