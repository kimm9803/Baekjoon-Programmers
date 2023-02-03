class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 2 * (k-1);
        if (index > numbers.length-1) {
            while (true) {
                if (index <= numbers.length-1) {
                    break;
                }
                index -= numbers.length;
            }
            answer = numbers[index];
        } else {
            answer = numbers[index];
        }
        return answer;
    }
}