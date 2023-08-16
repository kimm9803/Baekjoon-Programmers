class Solution {
    public int solution(int[][] sizes) {
        int finalMax = 0;
        int finalMin = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            
            if (max > finalMax) finalMax = max;
            if (min > finalMin) finalMin = min;
        }
        return finalMax * finalMin;
    }
}