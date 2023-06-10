package javaBeakjoon;

import java.util.Scanner;

public class Java1436 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int num = 666;
        int cnt = 1;

        while (cnt != N) {
            num++;
            if(String.valueOf(num).contains("666")) {
                cnt++;
            }
        }
        System.out.println(num);

    }
}
