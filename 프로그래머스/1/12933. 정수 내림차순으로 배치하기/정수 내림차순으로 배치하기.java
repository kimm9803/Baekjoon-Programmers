import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] strArr = String.valueOf(n).split("");
        Arrays.sort(strArr, Collections.reverseOrder());
        String str = "";
        for (int i = 0; i < strArr.length; i++) {
            str += strArr[i];
        }
        long answer = Long.valueOf(str);
        return answer;
    }
}