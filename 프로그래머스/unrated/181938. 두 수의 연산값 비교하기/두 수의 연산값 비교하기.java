class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str = String.valueOf(a) + String.valueOf(b);
        System.out.println(str);
        int x = Integer.parseInt(str);
        int y = 2 * a * b;
        if (x >= y) {
            answer = x;
        } else {
            answer = y;
        }
        return answer;
    }
}