class Solution {
    public int solution(int num1, int num2) {
        int answer = remainder(num1, num2);
        return answer;
    }
    
    public int remainder(int num1, int num2) {
        int rem = num1 % num2;
        return rem;
    }
}