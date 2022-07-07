package javaBeakjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Java2164 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = kb.nextInt();

        for(int i=1; i<=N; i++) { //카드를 큐에 저장 (1부터 N까지)
            myQueue.add(i);
        }
        while (myQueue.size()>1) { //카드가 한장 남을 때까지
            myQueue.poll(); //맨 위 카드를 버림
            myQueue.add(myQueue.poll()); //맨 위 카드를 가장 아래 카드로 이동
        }
        System.out.println(myQueue.poll()); //마지막 카드를 poll로 출력

    }
}
