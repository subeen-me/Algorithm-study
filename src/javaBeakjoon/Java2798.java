package javaBeakjoon;

import java.util.Scanner;

public class Java2798 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }

        int result = search(arr, n, m);
        System.out.println(result);
    }

    static int search(int[] arr, int n, int m) {

        int result = 0;

        for(int i= 0; i<n-2; i++) { // n-2까지만 순회

            for(int j=i+1; j<n-1; j++) { // 첫번째 카드 다음부터 n-1까지만 순회

                for(int k=j+1; k<n; k++) { //두번쨰 카드 다음부터 n까지 순회

                    int temp = arr[i] + arr[j] + arr[k]; //3개 카드의 합 변수

                    if(m == temp) { //m과 temp값이 같으면 리턴 후 종료
                        return temp;
                    }

                    //세 카드의 합이 이전합보다 크면서 && m보다 작은경우 result 갱신
                    if(result < temp && temp < m) {
                        result = temp;
                    }
                }
            }
        }

        return result;

    }
}
