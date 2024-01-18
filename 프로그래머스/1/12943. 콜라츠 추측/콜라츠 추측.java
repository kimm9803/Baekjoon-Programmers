class Solution {
    public int solution(int num) {
        int answer = 0;
        
        while (true) {
            // 주어진 수가 1이 되면 반복문 종료
            if (num == 1) {
                break;
            }
            
            if (answer == 500) {
                answer = -1;
                break;
            }
            
            if (num % 2 == 0) {
                // 짝수라면 2로 나눔
                num /= 2;
            } else if (num % 2 == 1) {
                // 홀수라면 3을 곱하고 1을 더함
                num = num * 3 + 1;
            }
            answer++;
        }
        
        return answer;
    }
}