import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(String my_string) {
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (my_string.charAt(i) == numbers[j]) {
                    list.add(my_string.charAt(i) - '0');
                }
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