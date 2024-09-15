class Solution {
    public long solution(long n) {
        long answer = 0;
        long sqrt = (long)Math.sqrt(n);
        if ((long)Math.pow(sqrt, 2) == n) {
            answer = (long)Math.pow(sqrt + 1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }
}

/*
 *  sqrt 한 값을 이용하여 Math.pow() 한 값이 n과 동일하면 n+1의 제곱을 리턴, 아니면 -1
*/