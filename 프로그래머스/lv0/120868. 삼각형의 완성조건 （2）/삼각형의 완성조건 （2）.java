import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int max = sides[1];
        int x = 0;
        while (sides[0] + x <= max) {
            x++;
        }
        while (true) {
            if (sides[0] + x > max && x <= max) {
                answer++;
            } else {
                break;
            }
            x++;
        }
        max = sides[1] + 1;
        int sum = sides[0] + sides[1];
        while (max < sum) {
            if (max < sum) {
                answer++;
                max++;
            }
        }
        return answer;
    }
}