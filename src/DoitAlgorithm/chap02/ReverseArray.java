package DoitAlgorithm.chap02;

import java.util.Scanner;

public class ReverseArray {
    //배열 요소 a[idx1]와 a[idx2]의 값을 바꿈
    static void swap(int[] a,  int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2]=t;
    }

    //배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a){
        for(int i=0; i<a.length/2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    static int sumOf(int[] a) {
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = kb.nextInt();

        int[] x = new int[num];

        for(int i=0; i<num; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = kb.nextInt();
        }

        System.out.println("합계를 구합니다.");
        System.out.println(sumOf(x));

        reverse(x);

        System.out.println("요소를 역순으로 정리합니다.");
        for(int i=0; i<num; i++) {
            System.out.println("x["+i+"] = " + x[i]);
        }

    }
}
