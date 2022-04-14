package DoitAlgorithm.chap01;

import java.util.Scanner;

public class SumForPosQ10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int a = 0;
        int b = 0;

        System.out.print("a의 값 : ");
        a = kb.nextInt();

        while (true) {
            System.out.print("b의 값 :");
            b = kb.nextInt();
            if (b > a)
                break;
            System.out.println("a보다 큰 값을 입력하세요!");
        }

        int ans = b-a;
        System.out.println("b - a는 "+ans+" 입니다.");


    }
}
