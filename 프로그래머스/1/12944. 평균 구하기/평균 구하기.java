class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        answer = (double)sum / arr.length;
        return answer;
    }
}