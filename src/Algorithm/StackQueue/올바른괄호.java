package Algorithm.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
    public static String solution(String str) {
        String answer = "YES";
        Stack<Character> myStack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(x == '(') myStack.push(x);
             else {
                if(myStack.isEmpty()) return "NO";
                myStack.pop();
            }
        }

        if(!myStack.isEmpty()) return "NO";
        return answer;
    }
}
