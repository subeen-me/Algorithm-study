package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Java10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<k; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                stack.pop();
            } else stack.add(n);
        }

        ArrayList<Integer> list = new ArrayList<>(stack);

        for(int var : list) {
            sum += var;
        }

        System.out.println(sum);

    }
}
