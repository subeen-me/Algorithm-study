package DoitAlgorithm.chap01;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("1부터 n까지의 합?");
        System.out.println("n의 값 : ");
        int n = kb.nextInt();

        int sum = 0;

        for(int i = 1; i<=n; i++) {
            if(i < n)
                System.out.print(i + " + ");
            else
                System.out.print(i);
            sum += i;
        }
        System.out.println(" = " + sum);


        System.out.println("합은 "+ sum +" 입니다");

    }
}
