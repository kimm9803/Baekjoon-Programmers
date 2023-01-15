class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            String str = Character.toString(c);
            answer += str.repeat(n);
        }
        return answer;
    }
}