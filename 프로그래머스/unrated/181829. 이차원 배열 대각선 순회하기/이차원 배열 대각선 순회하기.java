class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int sum = 0;
                if (i + j <= k) {
                    sum += board[i][j];
                    answer += sum;
                }
            }
        }
        return answer;
    }
}