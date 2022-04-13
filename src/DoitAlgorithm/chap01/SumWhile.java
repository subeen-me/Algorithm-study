package DoitAlgorithm.chap01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("1부터 n까지의 합?");
        System.out.println("n의 값 : ");
        int n = kb.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("변수 i의 값 : " + i);
        System.out.println("합은 "+sum +" 입니다");
    }
}
