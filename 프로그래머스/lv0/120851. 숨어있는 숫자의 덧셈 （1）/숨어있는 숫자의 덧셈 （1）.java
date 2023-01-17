class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] number = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < number.length; j++) {
                if (my_string.charAt(i) == number[j]) {
                    answer += number[j] - '0';
                }
            }
        }
        return answer;
    }
}