class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i < myString.length(); i++) {
            // myString 길이를 넘어가면 반복문 탈출
            if (i + pat.length() > myString.length()) {
                break;
            }
            String str = myString.substring(i, i + pat.length());
            if (str.equals(pat)) {
                answer++;
            }
        }
        return answer;
    }
}