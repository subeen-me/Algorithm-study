package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Java4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        while (true) {
            stack.clear();
            String str = br.readLine();
            boolean check = true;

            if(str.equals(".")) {
                break;
            }

            char[] arr = str.toCharArray();
            for(char c : arr) {
                if(c == '(' || c == '[') {
                    stack.push(c);
                }
                else if (c == ')') {
                    if(stack.empty() || stack.peek() != '(') {
                        check = false;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
                else if (c == ']') {
                    if(stack.empty() || stack.peek() != '[') {
                        check = false;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
            }
            if(check && stack.empty()) {
                sb.append("yes" + "\n");
            } else {
                sb.append("no" + "\n");
            }
        }

        System.out.println(sb);

    }
}
