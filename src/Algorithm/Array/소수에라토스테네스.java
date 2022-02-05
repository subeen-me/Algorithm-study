package Algorithm.Array;

import java.util.Scanner;

public class 소수에라토스테네스 {
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];
        for(int i = 2; i<n; i++) {
            if(ch[i]==0) {
                answer++;
                for(int j = i; j<=n; j=j+i) ch[j]=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        소수에라토스테네스 T = new 소수에라토스테네스();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
