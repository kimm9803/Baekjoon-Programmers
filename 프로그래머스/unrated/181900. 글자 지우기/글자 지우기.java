import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        boolean[] indi = new boolean[my_string.length()];
        
        // false로 일괄 초기화
        Arrays.fill(indi, false);
        
        // indices[i] 해당 값이 나오면 indi 인덱스 값을 true로 변경
        for (int i = 0; i < indices.length; i++) {
            indi[indices[i]] = true;
        }
        
        for (int i = 0; i < my_string.length(); i++) {
            // false면 answer에 더함
            if (indi[i] == false) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}