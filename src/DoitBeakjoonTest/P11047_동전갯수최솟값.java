package DoitBeakjoonTest;

import java.util.Scanner;

public class P11047_동전갯수최솟값 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 동전 개수
        int k = kb.nextInt(); //목표 금액
        int[] a = new int[n];

        for (int i=0; i<n; i++) {
            a[i] = kb.nextInt();
        }

        int count = 0;
        for(int i=n-1; i>=0; i--) {
            if(a[i] <= k) {
                count +=k / a[i];
                k = k % a[i];
            }
        }

        System.out.println(count);

    }
}
