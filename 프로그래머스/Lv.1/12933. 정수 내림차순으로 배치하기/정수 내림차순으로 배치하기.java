import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // n을 문자열로 변환
        String str = String.valueOf(n);
        
        // 각 자리를 정수형으로 전환 후 배열에 삽입
        Integer[] arr = new Integer[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        
        // 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());

        str = "";
        
        for (int i = 0; i < arr.length; i++) {
            str += String.valueOf(arr[i]);
        }
        
        answer = Long.parseLong(str);
        return answer;
    }
}