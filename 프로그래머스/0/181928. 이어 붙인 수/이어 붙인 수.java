class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String evenStr = "";
        String oddStr = "";
        
        for (int num : num_list) {
            if (num % 2 == 0) {
                evenStr += String.valueOf(num);
            } else if (num % 2 == 1) {
                oddStr += String.valueOf(num);
            }
        }
        
        answer = Integer.parseInt(evenStr) + Integer.parseInt(oddStr);
            
        return answer;
    }
}