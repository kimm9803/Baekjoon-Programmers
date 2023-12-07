class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        
        for (int i = 0; i < n; i++) {
            answer[i] = (i+1) * x;
        }
        
        return answer;
    }
}