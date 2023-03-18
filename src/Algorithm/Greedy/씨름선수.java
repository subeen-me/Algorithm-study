package Algorithm.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 씨름선수 {
    public static void main(String[] args) {
        씨름선수 T = new 씨름선수();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Body(h, w));
        }

        System.out.println(T.solution(arr,n));
    }

    public int solution(ArrayList<Body> arr, int n) {
        int cnt = 0; //선발되는 인원수
        Collections.sort(arr); //내림차순 정렬
        int max = Integer.MIN_VALUE;
        for(Body o : arr) {
            if(o.w>max) { //최댓값이 발견될 때
                max = o.w; //max 기준 바꿈
                cnt++; //cnt에 선발
            }
        }
        return cnt;
    }
}

class Body implements Comparable<Body> {
    public int h, w;

    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Body o) {
        return o.h-this.h; //내림차순 정렬
    }
}

