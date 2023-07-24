class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for (int i = 1; i <= my_string.length(); i+=m) {
            int n = i - 1;
            n += (c - 1);
            answer += my_string.charAt(n);
        }
        return answer;
    }
}