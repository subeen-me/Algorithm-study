package javaBeakjoon;

import java.util.Scanner;

public class Java2839 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int cnt = 0;

        while (true) { //while문으로 반복시키고 조건 달성되면 break로 빠져나간다
            if(n % 5 == 0) { //n이 5로 나누어 떨어질 때
                System.out.println(n/5 + cnt);
                break;
            }
            else if (n < 0) { //n이 4, 7처럼 3과 5로 나누어떨어지지 않을 때
                System.out.println(-1);
                break;
            }
            n = n-3; //if문에 안들어갔을때 3kg을 빼고
            cnt++; //갯수 +1 카운트
        }
    }
}
