using System;

public class Solution {
    public long solution(long n) {
        // n을 문자열로 변환 후 문자열 길이 측정
        // n의 각 자릿수를 배열에 집어넣고 내림차순 정렬
        // 문자열로 각 자릿수를 받고 long으로 형변환
        long answer = 0;
        string str = n.ToString();
        int[] arr = new int[str.Length];
        int i = 0;
        while (n > 0) {
            arr[i] = (int)(n % 10);
            n /= 10;
            i++;
        }
        Array.Sort(arr);
        Array.Reverse(arr);
        
        String arrToString = "";
        for (int j = 0; j < arr.Length; j++) {
            arrToString += arr[j].ToString();
        }
        answer = long.Parse(arrToString);
        
        return answer;
    }
}