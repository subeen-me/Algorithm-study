package Algorithm.SortingAndSearching;

import java.util.Scanner;

public class 선택정렬 {
    public static int[] solution(int n, int[] arr) {
        for(int i=0; i<n-1; i++) {
            int idx = i; //idx에 i값 대입해서 초기화
            for(int j=i+1; j<n; j++) {
                if(arr[j]<arr[idx]) //arr[0]보다 지금 j값이 더 작다면
                    idx = j; //현재 J의 인덱스번호를 idx에 저장 (비교해서 제일작은 값 idx에 대입)
            }
            int tmp = arr[i]; //arr[0]을 temp에 보관
            arr[i] = arr[idx]; //arr[0]에 j for문에서 돌았던 제일 작은 값을 대입
            arr[idx] = tmp; //보관해뒀던 arr[0]값을 j에서 찾았던 제일 작은 값 위치에 스왑한다
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = kb.nextInt();
        for(int x : solution(n, arr))
            System.out.println(x + " ");
    }
}
