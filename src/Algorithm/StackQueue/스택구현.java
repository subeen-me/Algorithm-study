package Algorithm.StackQueue;

import java.util.Scanner;

public class 스택구현 {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = kb.nextInt();

        stack = new int[N];

        for(int i=0; i<N; i++) {

            String str = kb.next();

            switch (str) {

                case "push" :
                    push(kb.nextInt());
                    break;

                case "pop" :
                    sb.append(pop()).append('\n');
                    break;

                case "size" :
                    sb.append(size()).append('\n');
                    break;

                case "empty" :
                    sb.append(empty()).append('\n');
                    break;

                case "top" :
                    sb.append(top()).append('\n');
                    break;
            }
        }

        System.out.println(sb);

    }

    public static void push(int item) {
        stack[size] = item;
        size++;
    }

    public static int pop() {
        if(size == 0) {
            return -1;
        }
        else {
            int res = stack[size - 1]; //맨 위에 있는 배열 출력
            stack[size - 1] = 0; //출력한 수는 0으로 초기화
            size--; //size 하나 감소
            return res;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if(size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top() {
        if(size == 0) {
            return -1;
        } else {
            return stack[size - 1];
        }
    }


}
