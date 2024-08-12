class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        answer = compare(num1, num2);
        
        return answer;
    }
    
    public int compare(int a, int b) {
        if (a == b) {
            return 1;
        } else {
            return -1;
        }
    }
}