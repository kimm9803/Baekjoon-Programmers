class Solution {
    public String solution(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer += "수";
            } else if (i % 2 == 0) {
                answer += "박";
            }
        }
        return answer;
    }
}

/*
 *  for문 n까지 반복하면서 i가 홀수면 "수" 추가,
 *  짝수면 "박" 추가
*/