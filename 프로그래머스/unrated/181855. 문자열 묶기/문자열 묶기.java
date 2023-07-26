class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] countArr = new int[31];
        for (int i = 0; i < strArr.length; i++) {
            countArr[strArr[i].length()]++; 
        }
        
        int max = 0;
        for (int i = 0; i < countArr.length; i++) {
            if (max < countArr[i]) {
                max = countArr[i];
                answer = max;
            }
        }
        
        return answer;
    }
}