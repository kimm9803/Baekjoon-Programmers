class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] comp = new int[1000];
        for (int i = 0; i < array.length; i++) {
            comp[array[i]]++;
        }
        int max = -1;
        int index = 0;
        for (int i = 0; i < comp.length; i++) {
            if (max < comp[i]) {
                max = comp[i];
                index = i;
            }
        }
        int count = 0;
        for (int i = 0; i < comp.length; i++) {
            if (max == comp[i]) {
                count++;
            }
        }
        if (count > 1) {
            answer = -1;
        } else {
            answer = index;
        }
        return answer;
    }
}