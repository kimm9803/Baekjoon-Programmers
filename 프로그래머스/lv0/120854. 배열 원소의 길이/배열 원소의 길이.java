class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            int j = strlist[i].length();
            answer[i] = j;
        }
        return answer;
    }
}