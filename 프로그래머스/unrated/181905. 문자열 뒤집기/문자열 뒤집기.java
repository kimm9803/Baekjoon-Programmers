class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        // 인덱스 s 전까지
        for (int i = 0; i < s; i++) {
            answer += my_string.charAt(i);
        }
        
        // 인덱스 s부터 e까지 뒤집음
        for (int i = e; i >= s; i--) {
            answer += my_string.charAt(i);
        }
        
        if (my_string.length()-1 > e) {
            for (int i = e + 1; i < my_string.length(); i++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}