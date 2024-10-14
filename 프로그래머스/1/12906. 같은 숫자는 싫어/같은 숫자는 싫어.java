import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            int num = stack.peek();
            if (arr[i] != num) {
                stack.push(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}

/*
 *  stack을 이용한 알고리즘
 *  1. 정수형 스택 선언
 *  2. arr 배열의 첫원소를 스택에 집어넣음
 *  3. arr 배열의 끝까지 for문으로 돌면서 stack.peek() 메서드를
 *     이용하여 배열의 해당 원소와 stack에 있는 값이 같지 않으면 push()
 *  4. answer 배열의 역순서로 stack.pop()
*/