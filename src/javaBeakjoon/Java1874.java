package javaBeakjoon;

import java.util.Scanner;
import java.util.Stack;

public class Java1874 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int a[] = new int[N];
        for(int i=0; i<N; i++) {
            a[i] = kb.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1; //오름차순 수
        boolean result = true;
        StringBuffer bf = new StringBuffer();
        for(int i=0; i<a.length; i++) {
            int su = a[i]; //수열에 있는 값을 차례로 가져온다. 현재 수열의 수
            if(su >= num) { //현재 수열 값 >= 오름차순 자연수: 값이 같아질 때까지 push()수행
                while (su >= num) { //push()
                    stack.push(num++); //push할 때마다 num의 값 1씩 증가
                    bf.append("+\n"); //+와 줄바꿈 출력
                }
                stack.pop(); //같아지면 pop
                bf.append("-\n"); //pop 하면 -와 줄바꿈 출력
            } else { //현재 수열 값 < 오름차순 자연수: pop()을 수행해 수열 원소를 꺼냄
                int n = stack.pop();
                //스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 수열 출력 불가
                if(n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if(result) System.out.println(bf.toString());
    }
}
