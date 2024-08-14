class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        int j = 0;
        for (int i = num_list.length - 1; i >= 0; i--) {
            answer[j] = num_list[i];
            j++;
        }
        return answer;
    }
}