import java.util.List;
import java.util.ArrayList;

class Solution {
    public long[] solution(long n) {
        
        String str = String.valueOf(n);
        
        long[] answer = new long[str.length()];
        
        int j = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            answer[j] = str.charAt(i) - '0';
            j++;
        }
        return answer;
    }
}