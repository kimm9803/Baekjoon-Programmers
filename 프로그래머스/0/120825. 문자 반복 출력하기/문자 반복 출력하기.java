class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            String str = Character.toString(my_string.charAt(i));
            answer += str.repeat(n);
        }
        return answer;
    }
}