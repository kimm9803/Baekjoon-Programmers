class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        
        for (int i = 0; i < my_string.length(); i++) {
            boolean tr = true;
            for (int j = 0; j < vowel.length; j++) {
                if (my_string.charAt(i) == vowel[j]) {
                    tr = false;
                    break;
                } else {
                    tr = true;
                }
            }
            
            if (tr == true) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}