package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Java17608 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int h = 0;
        for(int i=0; i<N; i++) {
            h = Integer.parseInt(br.readLine());
            stack.push(h);
        }

        int standard = stack.pop(); //기준 막대기
        int cnt = 1;
        int current = 0; //현재 비교하는 막대기
        while (!stack.isEmpty()) {
            current = stack.pop(); //pop으로 하나씩 꺼낸다
            if(current > standard) { //현재 막대기가 비교막대기보다 크면
                standard = current; //현재 막대기를 비교 막대기로 초기화하고
                cnt++; //갯수 카운트
            }
        }
        System.out.println(cnt);

    }
}
