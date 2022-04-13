package DoitAlgorithm.chap01;

import java.util.Scanner;

public class SumForQ9 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("a의 값 : ");
        int a = kb.nextInt();
        System.out.println("b의 값 : ");
        int b = kb.nextInt();

        System.out.println("a, b 사이의 모든 정수의 합은 : " + sumof(a,b));

    }

    static int sumof(int a, int b) {
        int min;
        int max;

        if(a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
        int sum = 0;
        for(int i = min; i<=max; i++) {
            sum +=i;
        }
        return sum;
    }
}
