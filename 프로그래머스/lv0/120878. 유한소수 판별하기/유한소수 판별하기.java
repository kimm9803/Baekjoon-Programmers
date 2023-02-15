class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int rest = gcd(a, b);
        a /= rest;
        b /= rest;
        
        loopout:
        for (int i = 2; i <= b; i++) {
            while (b % i == 0) {
                if (i != 2 && i != 5) {
                    answer = 2;
                    break loopout;
                }
                b /= i;
            }
        }
        return answer;
    }
    
    public static int gcd(int a, int b) {
        
        while(a % b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }
}