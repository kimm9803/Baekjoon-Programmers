class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '2') {         // 가위면 바위
                answer += '0';
            } else if (rsp.charAt(i) == '0') {  // 바위면 보
                answer += '5';
            } else {                            // 보면 가위
                answer += '2';
            }
        }
        return answer;
    }
}