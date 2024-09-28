import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }

        if (list.size() == 0) {
            list.add(-1);
        } else {
            Collections.sort(list);
        }
        
        answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

/*
 *  1. List 선언
 *  2. arr 배열을 돌면서 divisor로 나누어떨어지는 수를 List에 add
 *  3. 이 때, List가 비어있다면 -1 담은 후 리턴
 *  4. List 오름차순 정렬 후 answer 배열에 담아 리턴
*/