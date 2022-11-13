package DoitBeakjoonTest;

import java.util.Scanner;

public class P1427_내림차순정렬 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        int[] A = new int[str.length()];
        for(int i=0; i<str.length(); i++) {
            //substring(자르기시작할 인덱스위치, 끝나는 인덱스위치)
            A[i] = Integer.parseInt(str.substring(i, i+1));
        }
        for (int i=0; i<str.length(); i++) {
            int Max = i;
            for(int j = i + 1; j<str.length(); i++) {
                if(A[j] > A[Max]) //내림차순이므로 최댓값을 찾는다
                    Max = j;
            }

            if(A[i] < A[Max]) {
                int temp = A[i];
                A[i] = A[Max];
                A[Max] = temp;
            }
        }
        for (int i=0; i<str.length(); i++) {
            System.out.println(A[i]);
        }
    }
}
