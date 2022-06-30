package Algorithm.Twopointers;

import java.util.Scanner;

public class 최대매출 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }

        int answer = 0;
        int sum = 0;
        for(int i=0; i<k; i++) sum += arr[i]; //첫번째 윈도우 생성
        answer = sum;
        for(int i=k; i<n; i++) { //슬라이딩 윈도우
            sum += (arr[i]-arr[i-k]);
            answer = Math.max(answer, sum);
        }

        System.out.println(answer);

    }
}
