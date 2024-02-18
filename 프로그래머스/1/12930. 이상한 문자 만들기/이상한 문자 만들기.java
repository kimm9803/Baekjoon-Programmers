class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int index = 0;
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")) {
                index = 0;
            } else if (index % 2 == 0) {
                str[i] = str[i].toUpperCase();
                index++;
            } else if (index % 2 == 1) {
                str[i] = str[i].toLowerCase();
                index++;
            }
            answer += str[i];
        }
        
        return answer;
    }
}