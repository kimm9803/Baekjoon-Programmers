class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] alphabet = my_string.split("[a-zA-Z]");
        for (int i = 0; i < alphabet.length; i++) {
            if (!alphabet[i].isEmpty()) {
                answer += Integer.parseInt(alphabet[i]);
            }
        }
        return answer;
    }
}