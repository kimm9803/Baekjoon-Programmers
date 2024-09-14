import java.util.Arrays;
import java.util.Collections;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Integer[] integerB = new Integer[B.length];
        
        for (int i =0; i < B.length; i++) {
            integerB[i] = B[i];
        }
        
        Arrays.sort(A);
        Arrays.sort(integerB, Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * integerB[i];
        }
        
        return answer;
    }
}

/*
 *  두 개의 배열에서 한 개의 숫자를 뽑아 곱하고 누적을 반복하여 최솟값 만들기
 *  각 배열의 최소와 최대를 곱하여 더하면 최솟값이 됨
 *  A 오름차순, B 내림차순 정렬
*/