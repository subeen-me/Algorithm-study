package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java28278 {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        stack = new int[N];

        StringTokenizer st;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {

                case "1" :
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "2" :
                    sb.append(pop()).append('\n');
                    break;

                case "3" :
                    sb.append(size()).append('\n');
                    break;

                case "4" :
                    sb.append(isEmpty()).append('\n');
                    break;

                case "5" :
                    sb.append(peek()).append('\n');
                    break;

            }
        }

        System.out.println(sb);
    }

    public static void push(int x) {
        stack[size] = x;
        size++;
    }

    public static int pop() {
        if(size == 0) {
            return -1;
        }
        else {
            int res = stack[size - 1];
            stack[size - 1] = 0;
            size --;
            return res;
        }
    }

    public static int size() {
        return size;
    }

    public static int isEmpty() {
        if(size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int peek() {
        if(size == 0) {
            return -1;
        }
        else {
            return stack[size - 1];
        }
    }
}
