package javaBeakjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Java18411 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Integer[] arr = new Integer[3];
        for(int i=0; i<arr.length; i++){
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        Integer a = arr[0];
        Integer b = arr[1];
        System.out.println(a+b);
    }
}
