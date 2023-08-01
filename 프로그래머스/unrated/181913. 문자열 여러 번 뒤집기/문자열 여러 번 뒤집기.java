class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer;
        String reverseStr;
        String middleSave;
        
        for (int i = 0; i < queries.length; i++) {
            reverseStr = "";
            middleSave = "";
            for (int j = queries[i][1]; j >= queries[i][0]; j--) {
                reverseStr += my_string.charAt(j);
            }
            for (int j = 0; j < queries[i][0]; j++) {
                middleSave += my_string.charAt(j);
            }
            middleSave += reverseStr;
            if (queries[i][1] < my_string.length() - 1) {
                for (int k = queries[i][1] + 1; k < my_string.length(); k++) {
                    middleSave += my_string.charAt(k);
                }
            }
            my_string = middleSave;
        }
        answer = my_string;
        return answer;
    }
}