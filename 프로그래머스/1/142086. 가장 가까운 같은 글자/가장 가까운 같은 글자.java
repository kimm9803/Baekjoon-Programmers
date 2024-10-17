import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> lastIndexMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (lastIndexMap.containsKey(currentChar)) {
                answer[i] = i - lastIndexMap.get(currentChar);
            } else {
                answer[i] = -1;
            }
            lastIndexMap.put(currentChar, i);
        }

        return answer;
    }
}