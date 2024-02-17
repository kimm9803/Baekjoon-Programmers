class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() == 4 || s.length() == 6) {
            answer = true;
        } else {
            answer = false;
            return answer;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' ||
                s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' ||
                s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || 
                s.charAt(i) == '9') {
                
                answer = true;
            } else {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}