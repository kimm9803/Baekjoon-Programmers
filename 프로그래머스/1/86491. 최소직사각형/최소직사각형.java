class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0, length = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            
            if (width < max) width = max;
            if (length < min) length = min;
        }
        
        answer = width * length;
        
        return answer;
    }
}

/*
 *  명함을 적절히 회전시켰을 때, 각각 가장 긴 길이를 곱하면 지갑의 크기가 나옴
*/