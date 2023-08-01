import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            // 크기가 k 되면 반복문 빠져나감
            if (list.size() == k) {
                break;
            }
            // 배열원소 포함여부 확인 후 없으면 add
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        // 리스트 크기가 k가 안 되면 크기가 k 될 때까지 -1을 add
        if (list.size() != k) {
            for (int j = list.size(); j < k; j++) {
                list.add(-1);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}