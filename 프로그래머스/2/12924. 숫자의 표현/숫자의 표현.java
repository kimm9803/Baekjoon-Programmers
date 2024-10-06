class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        
        while (true) {
            int sum = 0;
            if (i > n)  break;
            
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum > n) {
                    break;
                } else if (sum == n) {
                    answer++;
                    break;
                }
            }
            i++;
        }
        return answer;
    }
}

/*
 *  초기 변수 i = 1
 *  while문 내의 for문을 이용하여 누적합이 n이 될 시 answer++
 *  누적합이 n을 초과하면 for문 break 후 i++
 *  i가 n을 초과하면 while문 break
*/