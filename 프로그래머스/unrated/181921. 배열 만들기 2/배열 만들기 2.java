import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String stri = String.valueOf(i);
            boolean tr = false;
            for (int j = 0; j < stri.length(); j++) {
                if (stri.charAt(j) == '0' || stri.charAt(j) == '5') {
                    tr = true;
                } else {
                    tr = false;
                    break;
                }
            }
            if (tr == true) {
                list.add(Integer.parseInt(stri));
            }
        }
        int[] answer;
        if (list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        
        return answer;
    }
}