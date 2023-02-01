import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int i = 2;
        
        while (true) {
            if (n == 1) break;
            
            if (n % i == 0) {
                if (list.contains(i) == false) {
                    list.add(i);
                }
                n /= i;
            } else {
                i++;
            }
        }
        int[] answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}