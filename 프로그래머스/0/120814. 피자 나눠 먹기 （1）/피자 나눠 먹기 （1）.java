class Solution {
    public int solution(int n) {
        int answer = 1;
        while (true) {
            int pizza = answer * 7;
            if (pizza >= n) {
                break;
            } else {
                answer++;
            }
        }
        return answer;
    }
}