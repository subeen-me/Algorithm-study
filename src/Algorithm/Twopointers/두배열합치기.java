package Algorithm.Twopointers;

import java.util.ArrayList;
import java.util.Scanner;

public class 두배열합치기 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0; // 두 포인터는 처음에 첫번째 배열 가리키고 있다
        while (p1<n && p2<m){ // 둘 중에 하나가 n, m과 같아지면 멈추는 while문
            if(a[p1]<b[p2]) answer.add(a[p1++]); //p1이 가리키는 값을 add하고 후위증감연산자로 p1값이 1 증가
            else answer.add(b[p2++]);
        }
        while (p1<n) answer.add(a[p1++]);
        while (p2<m) answer.add(b[p2++]);
        return answer;
    }

    public static void main(String[] args) {
        두배열합치기 T = new 두배열합치기();
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = kb.nextInt();
        }
        for(int x : T.solution(n, m, a, b)) System.out.println(x+" ");
    }
}
