package Algorithm.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {
    public static int solition(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) stack.push(x-'0'); //문자가 숫자라면 push, -'0'으로 int로 변환
            else { //lt-rt
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') stack.push(lt+rt);
                else if(x=='-') stack.push(lt-rt);
                else if(x=='*') stack.push(lt*rt);
                else if(x=='/') stack.push(lt/rt);
            }
        }
        answer = stack.get(0); //stack에 마지막에 남아있는 숫자 리턴
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solition(str));
    }
}
