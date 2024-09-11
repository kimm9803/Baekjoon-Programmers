class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;
        int sumPow = 0;
        
        for (int num : num_list) {
            mul *= num;
            sum += num;
        }
        
        sumPow = (int)Math.pow(sum, 2);
        
        return mul < sumPow ? 1 : 0;
    }
}