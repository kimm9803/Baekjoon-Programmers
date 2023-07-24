class Solution {
    public int[] solution(int[] arr) {
        int num = 0;
        for (int i = 0; i <= 10; i++) {
            num = (int)Math.pow(2, i);
            if (num == arr.length) {
                break;
            } else if (num > arr.length) {
                break;
            }
        }
        int[] answer = new int[num];
        
        if (num == arr.length) {
            answer = arr;
        } else {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i];
            }
            for (int i = arr.length; i < num; i++) {
                answer[i] = 0;
            }
        }
        return answer;
    }
}