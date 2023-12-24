using System;
using System.Linq;

public class Solution {
    public string solution(int[] numbers) {
        string answer = "";

        // 숫자를 문자열로 변환하여 정렬
        string[] nums = numbers.Select(n => n.ToString()).ToArray();

        // 두 숫자를 조합하여 큰 순서대로 정렬
        Array.Sort(nums, (a, b) => (b + a).CompareTo(a + b));

        // 배열을 이어붙여서 가장 큰 수 생성
        answer = string.Concat(nums);

        // answer가 0으로 시작하는 경우(모든 숫자가 0인 경우) "0" 반환
        if (answer[0] == '0')
            return "0";

        return answer;
    }
}