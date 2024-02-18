class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String str = "";
        
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            for (int j = i; j < i + p.length(); j++) {
                str += t.charAt(j);
            }

            if (Long.parseLong(str) <= Long.parseLong(p)) {
                answer++;
                str = "";
            } else {
                str = "";
            }
            
        }
        return answer;
    }
}