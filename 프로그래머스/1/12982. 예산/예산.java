import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget) {
                break;
            } else {
                answer++;
            }
        }
        return answer;
    }
}

/*
 *  각 부서가 신청한 금액 배열을 오름차순 정렬
 *  for문을 이용하여 누적합을 구하다가 예산(budget)을 넘어가면
 *  for문 종료
*/