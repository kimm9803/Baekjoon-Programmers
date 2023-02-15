class Solution {
    public int solution(int chicken) {
        int answer = 0;
        if (chicken < 10) {
            answer = 0;
            return answer;
        }
        while (true) {
            chicken -= 10;
            answer++;
            chicken += 1;
            if (chicken < 10) {
                break;
            }
        }
        
        return answer;
    }
}