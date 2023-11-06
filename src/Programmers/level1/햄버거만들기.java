package Programmers.level1;

import java.util.Stack;

public class 햄버거만들기 {
    public int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(int in : ingredient) {
            stack.push(in);
            if(stack.size() >=4) {
                int size = stack.size();
                if(stack.get(size-4) == 1
                        && stack.get(size-3) == 2
                        && stack.get(size-2) == 3
                        && stack.get(size-1) == 1) {
                    answer ++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return answer;
    }
}
