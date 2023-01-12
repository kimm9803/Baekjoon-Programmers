class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        /**
        **  양꼬치 12,000원 , 음료수 2,000원
        **/
        int service = n / 10;
        
        answer = 12000 * n + 2000 * (k - service);
        return answer;
    }
}