class Solution {
    public int solution(int price) {
        int answer = 0;
        double sale = 0.0;
        if (price >= 500000) {
            sale = price * 0.2;
        } else if (price >= 300000 && price < 500000) {
            sale = price * 0.1;
        } else if (price >= 100000 && price < 300000) {
            sale = price * 0.05;
        }
        answer = (int)(price - sale);
        return answer;
    }
}