package Algorithm.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {
    public static int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++) { //index로 접근
            if(str.charAt(i) == '(') stack.push('(');
            else { //닫는괄호일때
                stack.pop(); //여는괄호 빼기
                if(str.charAt(i-1) == '(') answer += stack.size(); //스택 사이즈(지금 남아있는 막대기, '('갯수)를 더한다
                else answer++; //아닌 경우 막대기 하나가 끝난 것이기 때문에 마지막 조각 +1 증가
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}
