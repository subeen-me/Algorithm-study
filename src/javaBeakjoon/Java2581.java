package javaBeakjoon;

import java.util.Scanner;

public class Java2581 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int M = kb.nextInt();
        int N = kb.nextInt();
        int sum = 0;
        int minPrime = 10000;
        for(int i=M; i<=N; i++) {
            boolean check = true; //소수인 경우 true, 아닌 경우 false
            if(i == 1) { //1은 소수가 아니므로 넘어간다
                continue;
            }
            for(int j=2; j<i; j++) {
                if(i % j == 0) {
                    check = false;
                }
            }
            if(check) { //소수일 때
                sum += i; //합 누적
                if(minPrime > i) {
                    minPrime = i;
                }
            }
        }
        if(minPrime == 10000) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minPrime);
        }
    }
}
