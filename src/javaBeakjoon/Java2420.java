package javaBeakjoon;

import java.io.IOException;
import java.util.Scanner;

public class Java2420 {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);

        Long N = kb.nextLong();
        Long M = kb.nextLong();

        kb.close();

        if(N > M) {
            System.out.println(N - M);
        } else if (M > N) {
            System.out.println(M - N);
        } else System.out.println("0");
    }
}
