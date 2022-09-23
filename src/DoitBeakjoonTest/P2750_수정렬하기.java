package DoitBeakjoonTest;

import java.util.Scanner;

public class P2750_수정렬하기 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt(); //수의 개수 입력
        int[] A = new int[N]; //개수만큼 배열 생성
        for(int i = 0; i<N; i++) { //배열에 차례로 수 담기
            A[i] = kb.nextInt();
        }
        //정렬
        for(int i=0; i<N-1; i++) { //N-1만큼 반복
            for(int j=0; j<N-1-i; j++) { //N-1에서 i를 뺀만큼 반복
                if(A[j] > A[j+1]) { //앞의 수가 뒤의 수보다 크다면 스왑
                    int temp = A[j]; //앞의 수(큰 수)를 temp 에 저장
                    A[j] = A[j+1] ; //작은 수를 앞쪽으로 스왑
                    A[j+1] = temp;
                }
            }
        }
        for(int i=0; i<N; i++) {
            System.out.println(A[i]);
        }
    }
}
