class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        int len = (intervals[0][1] - intervals[0][0] + 1) +
            (intervals[1][1] - intervals[1][0] + 1);
        int[] answer = new int[len];
        
        int num = 0;
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            answer[num] = arr[i];
            num++;
        }
        
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            answer[num] = arr[i];
            num++;
        }
        return answer;
    }
}