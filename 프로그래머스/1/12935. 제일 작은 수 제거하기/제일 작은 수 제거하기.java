import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        
        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arr.length - 1];
            int min = arr[0];
            int minIndex = 0;
            
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            
            list.remove(minIndex);
            
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}