class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = -1;
        int index = -1;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        
        answer[0] = max;
        answer[1] = index;
        return answer;
    }
}