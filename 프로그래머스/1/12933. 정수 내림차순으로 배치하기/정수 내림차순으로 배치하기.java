import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String nToStr = String.valueOf(n);
        String[] arr = nToStr.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        String strAnswer = "";
        for (String s : arr) {
            strAnswer += s;
        }
        
        answer = Long.parseLong(strAnswer);
        
        return answer;
    }
}