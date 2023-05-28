package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Java10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bfr.readLine(), " ");
        BigInteger biga = new BigInteger(st.nextToken());
        BigInteger bigb = new BigInteger(st.nextToken());

        System.out.println(biga.add(bigb));
        bfr.close();
    }
}
