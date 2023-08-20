package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java18258 {

    public static int[] queue = new int[2000000];
    public static int size = 0;
    public static int front = 0;
    public static int back = 0;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push" : push(Integer.parseInt(st.nextToken())); break;
                case "pop" : pop(); break;
                case "size" : size(); break;
                case "empty" : empty(); break;
                case "front" : front(); break;
                case "back" : back(); break;
            }
        }
        System.out.println(sb);
    }

    static void push(int n) {
        queue[back] = n;
        back++;
        size++;
    }

    static void pop() {
        if(size == 0) {
            sb.append(-1).append('\n');
        }
        else {
            sb.append(queue[front]).append('\n');
            size--;
            front++; //front 가 가리키는 위치는 1 증가
        }
    }

    static void size() {
        sb.append(size).append('\n');
    }

    static void empty() {
        if(size == 0) {
            sb.append(1).append('\n');
        } else sb.append(0).append('\n');
    }

    static void front() {
        if(size == 0) {
            sb.append(-1).append('\n');
        }
        else {
            sb.append(queue[front]).append('\n'); //맨 앞의 원소 출력
        }
    }

    static void back() {
        if(size == 0) {
            sb.append(-1).append('\n');
        }
        else {
            sb.append(queue[back - 1]).append('\n'); //맨 뒤의 원소 출력
        }
    }
}
