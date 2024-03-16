class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int num = 1;
        while (true) {
            int rejectNum = n / 2;
            int temp = num;
            int sum = 0;
            
            if (num > rejectNum) {
                break;
            }
            
            // 자연수의 합(sum)이 n과 같거나 n을 넘어가면 종료
            while (true) {
                sum += temp;
                temp++;
                
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
            num++;
        }
        // n이 1일 때 or n과 같은 경우 포함
        answer++;
        return answer;
    }
}