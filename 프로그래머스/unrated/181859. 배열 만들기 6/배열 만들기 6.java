import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (list.size() == 0) {
                list.add(arr[i]);
                i += 1;
            } else if (list.size() > 0 && list.get(list.size()-1) == arr[i]) {
                list.remove(list.size() - 1);
                i += 1;
            } else if (list.size() > 0 && list.get(list.size()-1) != arr[i]) {
                list.add(arr[i]);
                i += 1;
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        }
        int[] answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}