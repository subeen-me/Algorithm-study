package Algorithm.SortingAndSearching;

import java.util.Scanner;


public class 삽입정렬 {

    public static int[] solution(int n, int[] arr) {

        for(int i=1; i<n; i++) {
            int tmp = arr[i], j;
            for(j=i-1; j>=0; j--) {
                if(arr[j]>tmp) arr[j+1] = arr[j]; //뒷쪽으로 민다
                else break;
            }
            arr[j+1] = tmp; //항상 j for 문이 멈춘 그 바로 뒷편에 tmp 값 삽입
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = kb.nextInt();
        for(int x : solution(n, arr)) System.out.println(x + " ");
    }
}
