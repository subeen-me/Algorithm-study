package DoitAlgorithm.chap01;

import java.util.Scanner;

public class SquareQ14 {
    public static void main(String[] args) {
        System.out.println("사각형을 출력합니다.");
        System.out.print("단 수 :");
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for (int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
