package javaBeakjoon;

import java.util.Scanner;

public class Java5597 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        boolean[] arr = new boolean[31];

        for(int i=0; i<28; i++) {
            int n = kb.nextInt();
            arr[n] = true;
        }

        //배열을 순회하면서 false인 인덱스를 출력
        for(int i=1; i<=30; i++) {
            if(!arr[i]) System.out.println(i); //불리지 않은 사람
        }

    }
}
