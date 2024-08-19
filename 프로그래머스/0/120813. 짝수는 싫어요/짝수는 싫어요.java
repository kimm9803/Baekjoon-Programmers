class Solution {
    public int[] solution(int n) {
        int oddCnt = 0;
        for (int i = 1; i <= n; i += 2) {
            oddCnt++;
        }
        
        int[] answer = new int[oddCnt];
        int num = 1;
        for (int i = 0; i < oddCnt; i++) {
            answer[i] = num;
            num += 2;
        }
        return answer;
    }
}