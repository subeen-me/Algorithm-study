package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java2869 {
    public static void main(String[] args) throws IOException {

        //Scanner 사용
//        Scanner kb = new Scanner(System.in);
//        int up = kb.nextInt();
//        int down = kb.nextInt();
//        int length = kb.nextInt();
//        int day = (length - down) / (up - down);
//
//        //나머지가 있을 경우
//        if((length - down) % ( up - down) != 0) {
//            day++;
//        }
//        System.out.println(day);

        //BufferedReader 사용

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        int day = (length - down) / (up - down);

        if((length - down) % (up - down) != 0)
            day++;

        System.out.println(day );

    }

}
