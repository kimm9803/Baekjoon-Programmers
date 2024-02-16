import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] sToCharArr = s.toCharArray();
        Arrays.sort(sToCharArr);
        
        for (int i = sToCharArr.length -1; i >= 0; i--) {
            answer += sToCharArr[i];
        }
        return answer;
    }
}