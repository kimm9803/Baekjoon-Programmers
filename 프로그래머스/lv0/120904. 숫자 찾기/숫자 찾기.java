class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);
        String n = Integer.toString(k);
        boolean tr = false;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == n.charAt(0)) {
                tr = true;
                answer = i+1;
                break;
            }
        }
        if (tr == false) {
            answer = -1;
        }
        return answer;
    }
}