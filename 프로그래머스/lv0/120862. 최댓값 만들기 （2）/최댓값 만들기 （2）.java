import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int minus = numbers[0] * numbers[1];
        int plus = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        if (minus > plus) {
            answer = minus;
        } else {
            answer = plus;
        }
        return answer;
    }
}