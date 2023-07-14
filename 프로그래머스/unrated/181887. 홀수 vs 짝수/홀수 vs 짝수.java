class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sOdd = 0;
        int sEven = 0;
        for (int i = 0; i < num_list.length; i++) {
            if ((i + 1) % 2 == 1) {
                sOdd += num_list[i];
            } else if ((i + 1) % 2 == 0) {
                sEven += num_list[i];
            }
        }
        
        if (sOdd >= sEven) {
            answer = sOdd;
        } else {
            answer = sEven;
        }
        return answer;
    }
}