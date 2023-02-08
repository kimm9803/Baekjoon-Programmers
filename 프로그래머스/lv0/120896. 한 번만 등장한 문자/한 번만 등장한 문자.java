class Solution {
    public String solution(String s) {
        String answer = "";
        char[] alphabet = new char[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 97]++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] == 1) {
                answer += (char)(i + 97);
            }
        }
        
        return answer;
    }
}