class Solution {
    public int solution(int n) {
        int answer = 0;
        // 자연수 n의 이진수 1의 갯수
        int nCnt = 0;
        // 자연수 n 이진변환
        String strNCnt = Integer.toBinaryString(n);
        // n 이진변환 1의 갯수
        for (int i = 0; i < strNCnt.length(); i++) {
            if (strNCnt.charAt(i) == '1') {
                nCnt++;
            }
        }
        
        // n의 다음 큰 숫자 => num
        int num = n;
        while (true) {
            num++;
            // 자연수 num의 1의 갯수
            int numCnt = 0;
            // 자연수 num의 이진변환
            String strNumCnt = Integer.toBinaryString(num);
            
            // n 이진변환 1의 갯수
            for (int i = 0; i < strNumCnt.length(); i++) {
                if (strNumCnt.charAt(i) == '1') {
                    numCnt++;
                }
            }
            
            if (nCnt == numCnt) break;
        }
        answer = num;
        return answer;
    }
}