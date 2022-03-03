package javaBeakjoon;

import java.util.Scanner;

public class Java10871 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int x = kb.nextInt();

        for(int i=0; i<n; i++) {
            int a = kb.nextInt();
            if(a<x){
                System.out.print(a + " ");
            }
        }

//        int[] arr = new int[n];
//        for(int i=0; i<arr.length; i++) {
//            arr[i] = kb.nextInt();
//        }
//        for(int i=0; i<arr.length; i++) {
//            if(arr[i] < x) {
//                System.out.print(arr[i] + " ");
//            }
//        }
    }
}
