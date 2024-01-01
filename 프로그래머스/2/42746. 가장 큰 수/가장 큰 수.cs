using System;

public class Solution {
    public string solution(int[] numbers) {
        string answer = "";
        
        string[] nums = new string[numbers.Length];
        for (int i = 0; i < numbers.Length; i++) {
            nums[i] = numbers[i].ToString();
        }
        Array.Sort(nums, CompareNumbers);
        
        answer = string.Concat(nums);
        if (answer[0] == '0') return "0";
        return answer;
    }
    
    public int CompareNumbers(string a, string b) {
        string ab = a + b;
        string ba = b + a;
        return ba.CompareTo(ab);
    }
}