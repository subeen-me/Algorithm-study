package javaBeakjoon;

import java.util.Scanner;

public class Java2525 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int A = kb.nextInt();
        int B = kb.nextInt();
        int C = kb.nextInt();

        int min = (A * 60) + B;
        min += C;

        int hour = (min / 60) % 24; //시 (24 이상일 경우 0시부터 시작하도록 24를 나눈 나머지 연산이 필요)
        int minute = min % 60; //분

        System.out.println(hour + " " + minute);
    }
}
