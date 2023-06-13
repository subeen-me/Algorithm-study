package javaBeakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Java9063 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int xarr[] = new int[n];
        int yarr[] = new int[n];

        for(int i = 0; i<n; i++) {
            xarr[i] = kb.nextInt();
            yarr[i] = kb.nextInt();
        }

        Arrays.sort(xarr);
        Arrays.sort(yarr);

        int x1 = xarr[0];
        int x2 = xarr[n-1];
        int y1 = yarr[0];
        int y2 = yarr[n-1];

        int area = (x2 - x1) * (y2 - y1);

        System.out.println(area);
        kb.close();

    }
}
