import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ", -1);    // 문자열 마지막에 오는 빈 문자열도 추가
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == 0) {
                answer += " ";
            } else {
                answer += arr[i].substring(0, 1).toUpperCase();
                answer += arr[i].substring(1, arr[i].length()).toLowerCase();
                answer += " ";
            }
        }
        
        answer = answer.substring(0, answer.length() - 1);
        
        System.out.println("arr length = " + arr.length);
        System.out.println("arr[] = " + Arrays.toString(arr));
        return answer;
    }
}