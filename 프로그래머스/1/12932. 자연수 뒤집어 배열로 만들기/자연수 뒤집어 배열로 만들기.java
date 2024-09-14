class Solution {
    public int[] solution(long n) {
        String nToStr = String.valueOf(n);
        int[] answer = new int[nToStr.length()];
        
        int j = 0;
        for (int i = nToStr.length() - 1; i >= 0; i--) {
            answer[j] = Integer.parseInt(Character.toString(nToStr.charAt(i)));
            j++;
        }
        return answer;
    }
}