package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        int start = 1; //간식 먹는 순서

        while (!queue.isEmpty()) {
            if(queue.peek() == start) { //대기열과 간식 받아야하는 사람이 같다면 queue에서 꺼냄
                queue.poll();
                start++;
            } else if(!stack.isEmpty() && stack.peek() == start) { //추가대기열이 비어있지 않고 간식 받아야하는 사람이 같다면 stack에서 꺼냄
                stack.pop();
                start++;
            } else { //둘다 아니라면 queue에 있는 맨 위를 stack에 이동
                stack.push(queue.poll());
            }
        }

        while (!stack.isEmpty()) { //추가 대기열이 빌 때 까지 체크
            if(stack.peek() == start) { //간식 받아야하는 사람과 같다면 pop
                stack.pop();
                start++;
            } else { //다르면 return, while 문 종료
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");

    }
}
