package javaBeakjoon;

import java.util.Scanner;

public class Java1978 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int cnt = 0;
        int total = 0;
        for(int i=0; i<N; i++) {
            int a = kb.nextInt();
            for(int j=2; j<=a; j++) {
                if(a % j == 0) { //2부터 자기 숫자까지 차례로 나눠지면 카운트
                    cnt++;
                }
            }
            if (cnt == 1) { //자기 자신으로 나눠질 때만 소수 카운트
                total++;
            }
            cnt = 0;
        }
        System.out.println(total);
    }
}
