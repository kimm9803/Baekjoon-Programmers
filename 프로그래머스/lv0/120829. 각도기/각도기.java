class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        if (angle > 0 && angle < 90) {
            answer = 1; // 예각
        } else if (angle == 90) {
            answer = 2; // 직각
        } else if (angle > 90 && angle < 180) {
            answer = 3; // 둔각
        } else {
            answer = 4; // 평각
        }
        return answer;
    }
}