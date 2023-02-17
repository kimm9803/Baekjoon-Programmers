class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int temp = denom1;
        numer1 *= denom2;
        denom1 *= denom2;
        numer2 *= temp;
        denom2 *= temp;
        int numer = numer1 + numer2;
        int denom = denom1;
        answer[0] = numer / gcd(numer, denom);
        answer[1] = denom / gcd(numer, denom);
        return answer;
    }
    
    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }
}