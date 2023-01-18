class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int count = 0;
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                count++;
            }
        }
        
        int[] answer = new int[count];
        
        int j = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[j] = numlist[i];
                j++;
            }
        }
        
        return answer;
    }
}