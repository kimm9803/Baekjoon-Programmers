class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("a", ",");
        myStr = myStr.replace("b", ",");
        myStr = myStr.replace("c", ",");
        
        String[] str = myStr.split(",");
        
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("")) {
                continue;
            } else {
                count++;
            }
        }
        
        String[] answer = new String[count];
        int j = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("")) {
                continue;
            } else {
                answer[j] = str[i];
                j++;
            }
        }
        if (answer.length == 0) {
            answer = new String[1];
            answer[0] = "EMPTY";
        }
        return answer;
    }
}