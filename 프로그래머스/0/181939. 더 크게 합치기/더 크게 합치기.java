class Solution {
    public int solution(int a, int b) {
        
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        
        int plus = Integer.parseInt(strA + strB);
        int plusReverse = Integer.parseInt(strB + strA);
        
        return (plus >= plusReverse) ? plus : plusReverse;
    }
}