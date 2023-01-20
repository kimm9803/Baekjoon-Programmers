class Solution {
    public String solution(int age) {
        String answer = "";
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        String str = Integer.toString(age);
        
        for (int i = 0; i < str.length(); i++) {
            int j = str.charAt(i) - '0';
            answer += ch[j];
        }
        return answer;
    }
}