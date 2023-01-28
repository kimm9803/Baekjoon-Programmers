class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int[] ch = new int[before.length()];
        
        for (int i = 0; i < before.length(); i++) {
            for (int j = 0; j < before.length(); j++) {
                if (ch[j] == 0 && before.charAt(i) == after.charAt(j)) {
                    ch[j] = 1;
                    break;
                }
            }
        }
        boolean tr = false;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 1) {
                tr = true;
            } else {
                tr = false;
                break;
            }
        }
        
        if (tr == true) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}