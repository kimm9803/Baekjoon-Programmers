class Solution {
    public int solution(int[] array) {
        int answer = 0;
        char s = '7';
        for (int i = 0; i < array.length; i++) {
            String str = Integer.toString(array[i]);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == s) {
                    answer++;
                }
            }
        }
        return answer;
    }
}