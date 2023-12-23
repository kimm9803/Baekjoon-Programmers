using System;

public class Solution {
    public long solution(long n) {
        long answer = 0;
        long num = (long)Math.Sqrt(n);
        if (num * num == n) {
            answer = (num + 1) * (num + 1);
        } else {
            answer = -1;
        }
        return answer;
    }
}