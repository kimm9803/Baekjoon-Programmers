import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        stack.push(arr[0]);
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int num = stack.peek();
            if (num != arr[i]) {
                stack.push(arr[i]);
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}