package Algorithm;

import java.util.Scanner;

public class 보이는학생 {
    public int solution(int n, int[] arr) {
        // 첫번째 사람은 무조건 보이므로 1로 초기화
        int answer = 1;
        // 현재 제일 키 큰 사람을 max에 넣고 비교
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        보이는학생 T = new 보이는학생();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}
