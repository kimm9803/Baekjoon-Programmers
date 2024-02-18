class Solution {
    public int solution(int n) {
        int answer = 0;
        // 3진법
        String trinaryDigit = Integer.toString(n, 3);
        // 3진법(앞뒤 반전)
        String reverseTrinaryDigit = "";
        for (int i = trinaryDigit.length() - 1; i >= 0; i--) {
            reverseTrinaryDigit += trinaryDigit.charAt(i);
        }
        // 10진법
        answer = Integer.parseInt(reverseTrinaryDigit, 3);
        return answer;
    }
}