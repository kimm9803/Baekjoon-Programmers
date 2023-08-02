import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        // true면 map key에 등수, value에 인덱스값 put
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                map.put(rank[i], i);
            }
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        
        int a = map.get(keySet.get(0));
        int b = map.get(keySet.get(1));
        int c = map.get(keySet.get(2));
        
        answer = 10000 * a + 100 * b + c;
        return answer;
    }
}