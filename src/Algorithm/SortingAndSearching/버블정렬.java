package Algorithm.SortingAndSearching;

import java.util.Scanner;

public class 버블정렬 {

    public static int[] solution(int n, int[] arr) {
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j]>arr[j+1]) { //왼쪽이 오른쪽보다 크면
                    int tmp = arr[j]; //왼쪽에 있는 수를 tmp에 저장
                    arr[j] = arr[j+1]; //오른쪽 수를 왼쪽 수에 대입 (스왑)
                    arr[j+1] = tmp; //tmp에 저장했던 왼쪽 수를 오른쪽 수 위치에 저장(스왑)
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = kb.nextInt();
        for(int x : solution(n, arr)) System.out.println(x + " ");
    }
}
