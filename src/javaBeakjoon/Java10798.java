package javaBeakjoon;

import java.util.Scanner;

public class Java10798 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[][] arr = new char[5][15];
        int max = 0;

        for(int i=0; i<5; i++) {
            String str = kb.next();
            if(max < str.length()) max = str.length(); //j의 최대 길이를 판단

            for(int j=0; j<str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i=0; i<max; i++) {
            for(int j=0; j<5; j++) {
                if(arr[j][i] == '\0') continue; //char 배열의 초깃값은 '\0', 공백이라면 생략하고 print
                System.out.print(arr[j][i]);
            }
        }

        kb.close();
    }
}
