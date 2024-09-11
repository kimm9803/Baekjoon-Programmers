class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int planA = 0;
        int planB = 0;
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        
        planA = Integer.parseInt(aStr + bStr);
        planB = 2 * a * b;
        
        if (planA >= planB) {
            answer = planA;
        } else {
            answer = planB;
        }
        return answer;
    }
}