package javaBeakjoon;

import java.util.Scanner;

public class Java10250 {
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);

        int T = kb.nextInt(); // 테스트 케이스

        for(int i = 0; i < T; i++) {

            int H = kb.nextInt(); // 호텔의 층 수
            int W = kb.nextInt(); // 각 층의 방수. 하지만 쓸모없는 변수
            int N = kb.nextInt(); // 몇 번째 손님

            if(N % H == 0) { // 0으로 딱 나누어떨어지면
                System.out.println((H * 100) + (N / H));
            } else { //나누어 떨어지지 않으면
                System.out.println(((N % H) * 100) + ((N / H) + 1));
            }

        }

    }
}
