class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer;
        if (my_str.length() % n == 0) {
            answer = new String[my_str.length() / n];
        } else {
            answer = new String[my_str.length() / n + 1];
        }
        int index = 0;
        int i = 0;
        while (i < answer.length) {
            String str = "";
            if (index + n <= my_str.length()) {
                str = my_str.substring(index, index + n);
                answer[i] = str;
            } else {
                str = my_str.substring(index, my_str.length());
                answer[i] = str;
            }
            index += n;
            i++;
        }
        
        return answer;
    }
}