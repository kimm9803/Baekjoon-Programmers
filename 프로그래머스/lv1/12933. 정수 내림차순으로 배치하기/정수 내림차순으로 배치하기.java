import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        String[] arr = str.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        answer = Long.parseLong(result);
        return answer;
    }
}