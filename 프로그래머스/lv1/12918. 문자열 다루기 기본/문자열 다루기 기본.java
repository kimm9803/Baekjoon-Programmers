class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {
            answer = true;
        } else {
            answer = false;
            return answer;
        }
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if (s.charAt(i) == numbers[j]) {
                    answer = true;
                    break;
                } else {
                    answer = false;
                }
            }
            if (answer == false) {
                break;
            }
        }
        return answer;
    }
}