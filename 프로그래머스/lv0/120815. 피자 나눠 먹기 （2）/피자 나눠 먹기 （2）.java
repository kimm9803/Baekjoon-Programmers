class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while (true) {
            answer++;   // 피자 수
            int pizza = answer * 6; // 피자 조각수
            if (pizza % n == 0) {
                break;
            }
        }
        return answer;
    }
}