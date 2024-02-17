class Solution {
    public long solution(int price, long money, int count) {
        long answer = 0;
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
        if (sum < money) {
            answer = 0;
        } else {
            answer = sum - money;
        }
        return answer;
    }
}