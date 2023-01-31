class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int a = i; a <= j; a++) {
            String str = Integer.toString(a);
            String comp = Integer.toString(k);
            for (int b = 0; b < str.length(); b++) {
                if (str.charAt(b) == comp.charAt(0)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}