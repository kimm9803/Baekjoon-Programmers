import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= n) {
                int left = n - array[i-1];
                int right = array[i] - n;
                
                return left <= right ? array[i-1] : array[i];
            }
        }
        return array[array.length - 1];
    }
}