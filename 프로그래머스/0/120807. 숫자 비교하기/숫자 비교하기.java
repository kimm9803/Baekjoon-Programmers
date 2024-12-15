class Solution {
    public int solution(int num1, int num2) {
        int answer = compareNum(num1, num2);
        return answer;
    }
    
    public int compareNum(int num1, int num2) {
        int result = 0;
        
        if (num1 == num2) {
            result = 1;
        } else {
            result = -1;
        }
        
        return result;
    }
}