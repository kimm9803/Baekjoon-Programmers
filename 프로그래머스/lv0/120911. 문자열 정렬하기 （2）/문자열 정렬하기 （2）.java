import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        
        my_string = my_string.toLowerCase();
        
        char[] stringToChar = my_string.toCharArray();
        Arrays.sort(stringToChar);
        
        String answer = new String(stringToChar);
        
        return answer;
    }
}