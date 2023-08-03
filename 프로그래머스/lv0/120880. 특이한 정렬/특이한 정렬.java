import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < numlist.length; i++) {
            list.add(numlist[i]);
        }
        
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (Math.abs(a - n) != Math.abs(b - n)) {
                    return Math.abs(a - n) - Math.abs(b - n);
                } else {
                    return b - a;
                }
            }
        });

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}