package javaBeakjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Java25305 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        Integer arr[] = new Integer[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[k-1]);
    }
}
