import java.util.List;
import java.util.ArrayList;

class Solution {
    public long[] solution(long n) {
        List<Long> list = new ArrayList<>();
        
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        long[] answer = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}