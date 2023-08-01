class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        int index = 0;
        for (int i = 0; i < picture.length; i++) {
            for (int a = 0; a < k; a++) {
                String str = "";
                for (int j = 0; j < picture[i].length(); j++) {
                    for (int n = 0; n < k; n++) {
                        str += picture[i].charAt(j);
                    }
                 }
                answer[index] = str;
                index++;
            }
        }
        return answer;
    }
}