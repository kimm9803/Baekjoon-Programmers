class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        
        while (true) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    answer[1]++;
                }
            }
            
            s = s.replace("0", "");
            
            int sLength = s.length();
            
            s = Integer.toBinaryString(sLength);
            
            answer[0]++;
            
            if (s.equals("1")) {
                break;
            }
        }
        return answer;
    }
}

/*
 *  이진 변환 이전 -> 0 제거 -> 0 제거 후의 길이를 이진 변환
 *  "1"이 될 때까지 무한 반복
 *  [반복 횟수, 제거한 0의 개수] 리턴
*/