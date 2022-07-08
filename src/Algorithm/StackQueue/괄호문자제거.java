package Algorithm.StackQueue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        Stack<Character> myStack = new Stack<>();
        ArrayList<Character> answer = new ArrayList<>();
        for(char x : str.toCharArray()) {
            if(x == '(') {
                myStack.push(x);
            } else if (x == ')') {
                myStack.pop();
            } else if (myStack.isEmpty()){
                answer.add(x);
            }
        }
        StringBuilder arr = new StringBuilder();
        for(char x : answer) {
            arr.append(x);
        }
        return arr.toString();
    }
}
