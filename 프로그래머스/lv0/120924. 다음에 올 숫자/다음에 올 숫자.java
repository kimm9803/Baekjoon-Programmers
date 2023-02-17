class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int a = common[1] - common[0];
        int b = common[2] - common[1];
        if (a == b) {
            answer = common[common.length - 1] + a;
        } else {
            int x = common[1] / common[0];
            answer = common[common.length - 1] * x;
        }
        return answer;
    }
}