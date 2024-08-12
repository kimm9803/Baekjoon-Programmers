class Solution {
    public int solution(int age) {
        int answer = calYear(age);    
        
        return answer;
    }
    
    public int calYear(int age) {
        int year = 2022;
        int tYear = year - age + 1;
        
        return tYear;
    }
}