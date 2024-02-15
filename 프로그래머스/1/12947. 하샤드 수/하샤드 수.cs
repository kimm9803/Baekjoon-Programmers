public class Solution {
    public bool solution(int x) {
        bool answer = true;
        int copyX = x;
        
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        
        if (copyX % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}