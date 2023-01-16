class Solution {
    public int solution(int price) {
        int answer = 0;
        double sale = 0.0;
        if (price >= 500000) {
            sale = price * 0.8;
        } else if (price >= 300000) {
            sale = price * 0.9;
        } else if (price >= 100000) {
            sale = price * 0.95;
        } else {
            sale = price;
        }
        answer = (int)sale;
        return answer;
    }
}