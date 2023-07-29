import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) {
                count++;
            }
        }
        
        String[] answer = new String[count];
        int j = 0;
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) {
                answer[j] = str[i];
                j++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}