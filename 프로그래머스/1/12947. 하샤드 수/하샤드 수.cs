public class Solution {
    public bool solution(int x) {
        bool answer = true;
        int sum = 0;
        int copyX = x;
        
        while (copyX > 0) {
            sum += copyX % 10;
            copyX /= 10;
        }
        
        if (x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}

/*
 * 하샤드 수
 * x의 자릿수의 합을 구하려면 while문을 통해 x가 0이 될 때까지 반복하여 합을 구함.
 * 단, 값을 복사하여 사용
 * 나누어 떨어지면 true, 아니면 false
*/