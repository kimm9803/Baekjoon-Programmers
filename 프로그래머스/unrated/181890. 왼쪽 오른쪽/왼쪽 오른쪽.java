import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] str_list) {
        
        List<String> list = new ArrayList<>();
        // boolean tr = false;
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                // answer = new String[i - 1];
                // tr = true;
                
                for (int j = 0; j < i; j++) {
                    list.add(str_list[j]);
                }
                break;
            } else if (str_list[i].equals("r")) {
                // answer = new String[str_list.length - i - 1];
                // tr = true;
                int n = 0;
                for (int j = i + 1; j < str_list.length; j++) {
                    list.add(str_list[j]);
                    // n++;
                }
                break;
            }
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}