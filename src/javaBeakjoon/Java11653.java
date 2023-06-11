package javaBeakjoon;

import java.util.Scanner;

public class Java11653 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();

        for(int i=2; i<=Math.sqrt(N); i++) { //제곱근(루트) 구하기 위해 Math.sqrt(); 사용
            while (N % i == 0)   {
                System.out.println(i);
                N /= i;
            }
        }
        if(N != 1) {
            System.out.println(N);
        }
    }
}
