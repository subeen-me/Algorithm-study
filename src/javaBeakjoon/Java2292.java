package javaBeakjoon;

import java.util.Scanner;

public class Java2292 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int count = 1; //겹 수(최소)
        int range = 2; //범위(최솟값)

        if(n == 1) {
            System.out.println(1);
        }

        else {
            while (range <= n) { //범위가 n보다 커지기 전까지 반복
                range = range + (6 * count); //다음 범위의 최솟값으로 초기화
                count ++;
            }
            System.out.println(count);
        }
    }
}
