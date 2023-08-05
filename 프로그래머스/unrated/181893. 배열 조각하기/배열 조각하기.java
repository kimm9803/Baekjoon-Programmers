import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                for (int j = list.size() - 1; j >= query[i] + 1; j--) {
                    list.remove(j);
                }
            } else {
                for (int j = query[i] - 1; j >= 0; j--) {
                    list.remove(j);
                }
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}