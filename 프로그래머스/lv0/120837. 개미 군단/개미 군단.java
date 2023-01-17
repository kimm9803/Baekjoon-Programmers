class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        //장군개미 수
        answer += hp / 5;
        hp %= 5;
        
        //병정개미 수
        answer += hp / 3;
        hp %= 3;
        
        //일개미 수
        answer += hp / 1;
        hp %= 1;
        
        return answer;
    }
}