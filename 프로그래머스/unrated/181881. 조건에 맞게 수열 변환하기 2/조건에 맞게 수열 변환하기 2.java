import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while (true) {
            int[] com = new int[arr.length];
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) { // 50보다 크거나 같은 짝수
                    com[i] = arr[i] / 2;
                } else if (arr[i] % 2 == 1 && arr[i] < 50) {  // 50보다 작은 홀수
                    com[i] = arr[i] * 2 + 1;
                }
            }
            if (Arrays.equals(arr, com)) {
                answer--;
                break;
            }
            arr = com;
            answer++;
        }
        return answer;
    }
}