package javaBeakjoon;

import java.util.Scanner;

public class Java10809 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[] arr = new int[26];

        for(int i=0; i<arr.length; i++) {
            arr[i] = -1;
        }

        String s = kb.nextLine();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(arr[ch - 'a'] == -1) { //arr 값이 -1일 경우에만 초기화
                arr[ch - 'a'] = i;
            }
        }

        for(int v : arr) { //배열 출력
            System.out.print(v + " ");
        }

        kb.close();
    }
}
