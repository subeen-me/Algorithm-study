package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Java11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //우선순위 큐
        PriorityQueue<Integer> myQueue = new PriorityQueue<>(((o1, o2) -> {
            //절댓값 작은 데이터 우선
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            if(first_abs == second_abs) { //절댓값이 같은 경우 음수 우선
                return o1 > o2 ? 1 : -1;
            }

            //first가 더 크면 양수를 리턴, 뒤에 있는 데이터가 더 크면 음수를 리턴
            //절댓값을 기준으로 정렬하기
            return first_abs - second_abs;
        }));

        for(int i=0; i<N; i++) {
            int request = Integer.parseInt(br.readLine());
            if(request == 0) {
                if(myQueue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(myQueue.poll());
                }
            } else {
                myQueue.add(request);
            }
        }
    }
}
