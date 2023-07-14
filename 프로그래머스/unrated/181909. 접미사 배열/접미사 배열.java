import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            String str = "";
            for (int j = i; j < my_string.length(); j++) {
                str += my_string.charAt(j);
            }
            answer[i] = str;
        }
        Arrays.sort(answer);
        return answer;
    }
}