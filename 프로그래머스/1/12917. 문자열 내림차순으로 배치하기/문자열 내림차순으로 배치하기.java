import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] sToArr = s.split("");
        Arrays.sort(sToArr, Collections.reverseOrder());
        
        for (int i = 0; i < sToArr.length; i++) {
            answer += sToArr[i];
        }
        return answer;
    }
}