import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] arr = new boolean[10];
        Arrays.fill(arr, false);
        
        for (int i = 0; i < numbers.length; i++) {
            arr[numbers[i]] = true;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == false) {
                answer += i;
            }
        }
        return answer;
    }
}

/*
 *  1. 10의 크기를 가진 배열 선언
 *  2. numbers 배열을 돌면서 각 원소값에 해당하는 인덱스를 true
 *  3. false인 인덱스를 더하여 return
*/