package DoitAlgorithm.chap01;

import java.util.Scanner;

public class SumForPosQ11 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("양의 정수를 입력하세요. ");
        int n;
        do {
            System.out.print("정수값 :");
            n = kb.nextInt();
        } while (n <= 0);

        int ans = 0;
        while (n > 0) {
            n /= 10;
            ans++;
        }

        System.out.println("그 수는 "+ans+" 자리입니다.");
    }
}
