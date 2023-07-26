class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer;
        // 행의 길이가 더 길면
        if (arr.length > arr[0].length) {
            answer = new int[arr.length][arr.length];
            for (int i = 0; i < arr.length; i++) {
                // 기존값 대입
                for (int j = 0; j < arr[i].length; j++) {
                    answer[i][j] = arr[i][j];
                }
                // 행의 길이만큼 0 추가
                for (int j = arr[i].length; j < arr.length; j++) {
                    answer[i][j] = 0;
                }
            }
        } else if (arr.length < arr[0].length) {    // 열의 길이가 더 길면
            answer = new int[arr[0].length][arr[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        } else {
            answer = arr;
        }
        return answer;
    }
}