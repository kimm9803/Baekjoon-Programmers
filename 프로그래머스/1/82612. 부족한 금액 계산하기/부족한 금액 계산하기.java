class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
        if (sum > money) {
            answer = sum - money;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}

/*
 *  for문 반복을 이용
 *  count만큼 반복하면서 누적 합을 구함
 *  누적 합 - money => 리턴값
 *  long 조심할 것
*/