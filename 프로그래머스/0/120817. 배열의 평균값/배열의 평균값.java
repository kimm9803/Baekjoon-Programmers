class Solution {
    public double solution(int[] numbers) {
        double answer = calAverage(numbers);
        return answer;
    }
    
    public double calAverage(int[] numbers) {
        int sum = 0;
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            sum += numbers[i];
        }
        
        double avg = (double)sum / (double)len;
        
        return avg;
    }
}