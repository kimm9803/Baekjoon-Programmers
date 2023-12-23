public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int i = 0;
        int num = x;
        long xx = x;
        while (i < n) {
            answer[i] = xx;
            xx += num;
            i++;
        }
        return answer;
    }
}