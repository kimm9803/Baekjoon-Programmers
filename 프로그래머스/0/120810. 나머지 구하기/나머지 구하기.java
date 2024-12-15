class Solution {
    public int solution(int num1, int num2) {
        int answer = remainder(num1, num2);
        return answer;
    }
    
    public int remainder(int num1, int num2) {
        int result = num1 % num2;
        return result;
    }
}