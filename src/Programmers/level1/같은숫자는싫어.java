package Programmers.level1;

import java.util.Stack;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<arr.length; i++) {

            if(stack.isEmpty()) {
                stack.push(arr[i]);
            }
            else if(stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];

        for(int i=stack.size()-1; i>=0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
