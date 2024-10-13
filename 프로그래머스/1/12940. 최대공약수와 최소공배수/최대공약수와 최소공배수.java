class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        if (n >= m) {
            answer[0] = gcd(n, m);
            answer[1] = n * m / gcd(n, m);
        } else {
            answer[0] = gcd(m, n);
            answer[1] = n * m / gcd(m, n);
        }
        
        return answer;
    }
    
    public int gcd(int a, int b) {
        int temp;
        
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        
        return a;
    }
}