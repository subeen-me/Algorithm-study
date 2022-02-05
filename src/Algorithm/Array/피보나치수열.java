package Algorithm.Array;

import java.util.Scanner;

public class 피보나치수열 {

    // 배열 안쓰는 경우
    public void solution2(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i<n; i++){
            c = a+b; //i번째
            System.out.print(c + " ");
            a=b;
            b=c;

        }
    }

    // 배열 쓰는 경우
    public int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for(int i=2; i<n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        피보나치수열 T = new 피보나치수열();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        // 배열 쓰는 경우
         for(int x : T.solution(n)) System.out.print(x+" ");
        // 안쓰는 경우
        //T.solution2(n);
    }
}
