class Solution {
    public int solution(int num1, int num2) {
        int answer = division(num1, num2);
        return answer;
    }
    
    public int division(int num1, int num2) {
        int div = (int)((double)num1 / (double)num2 * 1000);
        return div;
    }
}