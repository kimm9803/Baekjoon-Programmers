class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) {
                return answer;
            }
            
            String s = A.substring(A.length() - 1);
            A = s + A.substring(0, A.length() - 1);
            answer++;
        }
        return -1;
    }
}