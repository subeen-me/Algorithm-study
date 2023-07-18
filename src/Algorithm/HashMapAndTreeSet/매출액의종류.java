package Algorithm.HashMapAndTreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 매출액의종류 {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<k-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        int lt = 0;
        for(int rt=k-1; rt<n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if(map.get(arr[lt]) == 0) map.remove(arr[lt]); //0일떄 키 삭제
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        매출액의종류 T = new 매출액의종류();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n, k, arr)) System.out.println(x + " ");
    }
}
