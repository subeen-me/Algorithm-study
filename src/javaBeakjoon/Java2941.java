package javaBeakjoon;

import java.io.IOException;
import java.util.Scanner;

public class Java2941 {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);

        String arr[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        String str = kb.nextLine();

        for(String val : arr) {
            str = str.replace(val, "!");
        }

        System.out.println(str.length());
    }
}
