class Solution {
    public String solution(int n) {
        String answer;
        char[] c = new char[n];
        if (n == 1) {
            answer = new String("수");
        } else {
            for (int i = 0; i < n; i+=2) {
                c[i] = '수';
            }
            for (int i = 1; i < n; i+=2) {
                c[i] = '박';
            }
            
            answer = new String(c);
        }
        return answer;
    }
}