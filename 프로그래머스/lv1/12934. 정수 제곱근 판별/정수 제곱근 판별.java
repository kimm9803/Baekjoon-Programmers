class Solution {
    public long solution(long n) {
        long answer = 0;
        long i = (long)Math.sqrt(n);
        if (i*i == n) {
            answer = (long)Math.pow(i+1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }
}