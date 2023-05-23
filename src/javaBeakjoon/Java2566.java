package javaBeakjoon;

import java.io.IOException;
import java.util.Scanner;

public class Java2566 {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);

        int[][] val = new int[9][9];
        int max = 0;
        int x = 0, y = 0;

        for (int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                val[i][j] = kb.nextInt();
                if (max < val[i][j]) {
                    max = val[i][j];
                    x = i; y = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((x+1) + " " + (y+1));
    }
}
