class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int num = my_string.length() - n;
        for (int i = num; i < my_string.length(); i++) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}