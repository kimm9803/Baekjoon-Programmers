class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        
        int min = 2147483647;
        int max = -2147483647;
        
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            
            if (min > num) {
                min = num;
            }
            
            if (max < num) {
                max = num;
            }
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}