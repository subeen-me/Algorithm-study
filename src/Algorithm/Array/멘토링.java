package Algorithm.Array;


import java.util.Scanner;

// 4중 for문 2차원 배열
public class 멘토링 {
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for(int i=1; i<=n; i++) { //i,j 짝 찾기 위해 2중 for문
            for(int j=1; j<=n; j++) {
                int cnt = 0;
                for(int k=0; k<m; k++) { //짝이 통과가 되는지 확인. 0부터니까 m전까지 3이면 0,1,2 이렇게
                    int pi=0, pj=0; // 0등으로 초기화
                    for(int s=0; s<n; s++){
                        if(arr[k][s]==i) pi=s;
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==m) { //m개의 테스트에서 만족하면 짝 카운팅
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        멘토링 T = new 멘토링();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n]; // 2차원 배열 생성
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j]=kb.nextInt(); // 2차원 배열 받는다
            }
        }
        System.out.println(T.solution(n, m, arr));
    }
}
