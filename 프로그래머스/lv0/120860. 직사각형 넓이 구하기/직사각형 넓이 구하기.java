class Solution {
    public int solution(int[][] dots) {
        int max_x = -257;
        int max_y = -257;
        int min_x = 257;
        int min_y = 257;
        for (int i = 0; i < dots.length; i++) {
            if (max_x < dots[i][0]) {
                max_x = dots[i][0];
            }
            if (max_y < dots[i][1]) {
                max_y = dots[i][1];
            }
            if (min_x > dots[i][0]) {
                min_x = dots[i][0];
            }
            if (min_y > dots[i][1]) {
                min_y = dots[i][1];
            }
        }
        int answer = (max_x - min_x) * (max_y - min_y);
        
        return answer;
    }
}