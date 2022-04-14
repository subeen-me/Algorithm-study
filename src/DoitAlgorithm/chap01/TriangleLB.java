package DoitAlgorithm.chap01;

import java.util.Scanner;

public class TriangleLB {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n;

        System.out.println("이등변 삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까?");
            n = kb.nextInt();
        } while (n <= 0);

        for(int i=1; i<=n;i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
