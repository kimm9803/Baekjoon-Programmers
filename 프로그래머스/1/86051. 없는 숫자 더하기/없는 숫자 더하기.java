class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int[] chk = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            chk[numbers[i]] = 1;
        }
        
        for (int i = 0; i < 10; i++) {
            if (chk[i] == 0)    answer += i;
        }
        return answer;
    }
}