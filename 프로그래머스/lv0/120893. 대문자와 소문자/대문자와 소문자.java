class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String lowercase = my_string.toLowerCase();
        for (int i = 0; i < my_string.length(); i++) {
            // 소문자면 대문자로 변환
            if (my_string.charAt(i) == lowercase.charAt(i)) {
                answer += Character.toUpperCase(my_string.charAt(i));
            } else {
            // 대문자면 소문자로 변환
                answer += Character.toLowerCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}