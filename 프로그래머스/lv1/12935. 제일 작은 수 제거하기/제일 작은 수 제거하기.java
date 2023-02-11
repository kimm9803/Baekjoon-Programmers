import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if (arr.length == 1) {
            answer = new int[1];
        } else {
            answer = new int[arr.length - 1];
        }
        List<Integer> list = new ArrayList<>();
        
        int min = 2147483647;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            list.add(arr[i]);
        }

        if (arr.length == 1) {
            answer[0] = -1;
        } else {
            for (int j = 0; j < list.size(); j++) {
                answer[j] = list.get(j);
            }
        }
        return answer;
    }
}