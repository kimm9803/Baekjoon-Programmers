class Solution {
    public int solution(int age) {
        int answer = getYear(age);
        return answer;
    }
    
    public int getYear(int age) {
        int result = 2022 - age + 1;
        
        return result;
    }
}