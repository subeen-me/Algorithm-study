package javaBeakjoon;

import java.util.Scanner;

public class Java15596 {

    class Test {
        long sum(int[] a) {
            long sum = 0;

            for(int i=0; i<a.length; i++)  {
                sum += a[i];
            }
            return sum;
        }
    }
}
