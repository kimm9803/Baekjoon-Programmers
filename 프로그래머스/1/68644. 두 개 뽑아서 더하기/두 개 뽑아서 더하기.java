import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        
        List<Integer> list = new ArrayList<>();
        
        int sum = 0;
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if (!list.contains(sum)) {
                    list.add(sum);
                }
                sum = 0;
            }
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

/*
 *  브루투포스 알고리즘
 *  모든 경우의 수를 list에 담음
 *  단, 두 개의 수를 더했을 때 list에 해당 수가 있으면 담지 않음
*/