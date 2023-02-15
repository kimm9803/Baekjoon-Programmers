class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] average = new double[score.length];
        for (int i = 0; i < score.length; i++) {
            average[i] = (double)(score[i][0] + score[i][1]) / 2;
        }
        for (int i = 0; i < average.length; i++) {
            int count = 1;
            for (int j = 0; j < average.length; j++) {
                if (average[i] < average[j]) {
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}