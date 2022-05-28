package javaBeakjoon;

import java.util.Scanner;

public class Java2869 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int up = kb.nextInt();
        int down = kb.nextInt();
        int length = kb.nextInt();
        int day = (length - down) / (up - down);

        //나머지가 있을 경우
        if((length - down) % ( up - down) != 0) {
            day++;
        }

        System.out.println(day);

    }


}
