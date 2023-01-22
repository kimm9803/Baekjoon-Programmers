class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer += my_string.charAt(0);
        for (int i = 1; i < my_string.length(); i++) {
            boolean tr = false;
            for (int j = 0; j < i; j++) {
                if (my_string.charAt(i) != my_string.charAt(j)) {
                    tr = true;
                } else {
                    tr = false;
                    break;
                }
            }
            if (tr == true) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}