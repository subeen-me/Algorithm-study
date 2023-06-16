package javaBeakjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Java2751 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = kb.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<n; i++) {
            list.add(kb.nextInt());
        }

        Collections.sort(list);

        for (int val : list) {
            sb.append(val).append('\n');
        }
        System.out.println(sb);
    }
}
