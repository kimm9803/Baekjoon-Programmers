public class Solution {
    public int[] solution(long n) {
        string str = n.ToString();
        int[] answer = new int[str.Length];
        int i = 0;
        while (n > 0) {
            answer[i] = (int)(n % 10);
            n /= 10;
            i++;
        }
        return answer;
    }
}