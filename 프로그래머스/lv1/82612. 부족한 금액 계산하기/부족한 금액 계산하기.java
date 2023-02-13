class Solution {
    public long solution(int price, long money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            money -= price * i;
        }
        if (money >= 0) {
            answer = 0;
        } else {
            answer = Math.abs(money);
        }
        return answer;
    }
}