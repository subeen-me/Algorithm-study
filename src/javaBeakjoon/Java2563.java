package javaBeakjoon;

import java.util.Scanner;

public class Java2563 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt(); //색종이 수
        int x_point, y_point, area = 0;
        boolean[][] check = new boolean[100][100];

        for(int i=0; i<num; i++) {
            x_point = kb.nextInt();
            y_point = kb.nextInt();
            for(int x = x_point; x<x_point+10; x++) {
                for(int y = y_point; y<y_point+10; y++) {
                    if(!check[x][y]) { //아직 체크가 안 된 값인지 확인
                        area ++;
                        check[x][y] = true;
                    }
                }
            }
        }

        System.out.println(area);

    }
}
