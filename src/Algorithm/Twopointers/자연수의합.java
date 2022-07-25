package Algorithm.Twopointers;

import java.util.Scanner;

public class 자연수의합 {
    public int solution(int n){
        int answer=0, cnt=1;
        n--;
        while(n>0){
            cnt++;
            n=n-cnt;
            if(n%cnt==0) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        자연수의합 T = new 자연수의합();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.print(T.solution(n));
    }
}
