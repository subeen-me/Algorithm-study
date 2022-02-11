package Algorithm.Array;

import java.util.Scanner;

public class 임시반장정하기 {
    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;
        for(int i=1; i<=n; i++) {
            int cnt = 0; // i번 학생과 같은 반을 했던 학생이 몇명인지 카운트
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++) {
                    if(arr[i][k] == arr[j][k]) { // i번 학생과 j번 학생이 같은 반을 몇 번 했는지 묻고 같으면 카운트 누적
                        cnt++;
                        break; // 중요.
                    }
                }
            }
            if(cnt>max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        임시반장정하기 T = new 임시반장정하기();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i=1; i<n; i++) { // i는 학생번호. 1번부터
            for(int j=1; j<=5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
