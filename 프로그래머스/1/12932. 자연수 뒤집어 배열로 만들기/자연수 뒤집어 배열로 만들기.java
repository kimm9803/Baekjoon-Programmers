import java.util.List;
import java.util.ArrayList;

class Solution {
    public long[] solution(long n) {
        String str = String.valueOf(n);
        long[] answer = new long[str.length()];
        int num = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(num) - '0';
            num--;
        }
        return answer;
    }
}