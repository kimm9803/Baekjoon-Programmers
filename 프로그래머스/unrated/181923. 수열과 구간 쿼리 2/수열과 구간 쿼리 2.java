import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < queries.length; i++) {
            // 특정 쿼리의 답이 존재 유무 판단
            boolean tr = false;
            int min = 1000001;
            
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    if (min > arr[j]) {
                        min = arr[j];
                    }
                }
            }
            if (min == 1000001) {
                list.add(-1);
            } else {
                list.add(min);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}