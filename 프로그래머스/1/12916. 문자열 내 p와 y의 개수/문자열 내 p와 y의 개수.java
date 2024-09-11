class Solution {
    boolean solution(String s) {

        int pCnt = 0;
        int yCnt = 0;
        
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                pCnt++;
            } else if (s.charAt(i) == 'y') {
                yCnt++;
            }
        }
        
        return (pCnt == yCnt) ? true : false;
    }
}