package javaBeakjoon;

import java.util.Scanner;

public class Java1546 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        double[] score = new double[n];

        double max = Double.MIN_VALUE;

        for(int i = 0; i<score.length; i++) {
            score[i] = kb.nextInt();

            if(max < score[i]) {
                max = score[i];
            }
        }

        double sum = 0;

        for(int i=0; i<score.length; i++) {
            sum += (score[i] / max) * 100;
        }

        System.out.println(sum / score.length);
    }
}
