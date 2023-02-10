class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int num_1 = 0;
        int num_2 = 0;
        int b1 = 0;
        int b2 = 0;
        for (int i = bin1.length() - 1; i >= 0; i--) {
            if (bin1.charAt(b1) == '1') {
                num_1 += Math.pow(2, i);
            }
            b1++;
        }
        
        for (int i = bin2.length() - 1; i >= 0; i--) {
            if (bin2.charAt(b2) == '1') {
                num_2 += Math.pow(2, i);
            }
            b2++;
        }
        int result = num_1 + num_2;
        String str = "";
        while (result > 0) {
            str += Integer.toString(result % 2);
            result /= 2;
        }
        
        for (int i = str.length()-1; i >= 0; i--) {
            answer += str.charAt(i);
        }
        if (bin1.equals("0") && bin2.equals("0")) {
            answer = "0";
        }
        return answer;
    }
}