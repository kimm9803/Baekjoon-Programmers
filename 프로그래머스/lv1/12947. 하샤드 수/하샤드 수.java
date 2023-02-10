class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int temp = x;   // x값 임의 저장
        int compare = 0;
        while (temp > 0) {
            compare += temp % 10;
            temp /= 10;
        }
        if (x % compare == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}