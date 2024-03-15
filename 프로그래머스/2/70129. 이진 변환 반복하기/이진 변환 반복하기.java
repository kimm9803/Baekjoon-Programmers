class Solution {
    public int[] solution(String s) {
        int binaryTransformationCnt = 0;
        int removeCnt = 0;
        
        while (true) {
            String str = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    removeCnt++;
                } else if (s.charAt(i) == '1') {
                    str += "1";
                }
            }
            // 0 제거 후 길이
            int strLength = str.length();
            // 이진 변환 결과
            String binary = Integer.toBinaryString(strLength);
            s = binary;
            // 이진 변환 횟수 증가
            binaryTransformationCnt++;
            // 이진 변환 결과가 "1"이 되면 종료
            if (binary.equals("1"))     break;
        }
        int[] answer = {binaryTransformationCnt, removeCnt};
        return answer;
    }
}