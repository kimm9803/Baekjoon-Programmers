import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        answer = stack.isEmpty();
        return answer;
    }
}

/*
    스택을 이용한 알고리즘
    반복문을 통해 문자열 탐색
    '(' 가 나오면 스택에 담음
    ')' 가 나오면 스택 빼냄
    최종적으로 스택이 비어있으면 true / else false
    else 스택이 비어있는 상태에서 ')' 가 나오면 false
*/