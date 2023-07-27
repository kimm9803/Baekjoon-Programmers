class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) { 
                start = i;
                break;
            }
        }
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }
        
        int[] answer;
        if (start == -1 && end == -1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            int n = 0;
            answer = new int[end - start + 1];
            for (int j = start; j <= end; j++) {
                answer[n] = arr[j];
                n++;
            }
        }
        return answer;
    }
}