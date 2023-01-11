class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        // height : 머쓱이 키 / array배열 : 반 친구들 키
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                answer++;
            }
        }
        return answer;
    }
}