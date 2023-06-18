package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Java1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        String[] arr = new String[num];

        for(int i=0; i<num; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (s1, s2) -> { //정렬
            if(s1.length() == s2.length()) { //길이가 같을 시에는
                return s1.compareTo(s2); //String을 사전순으로 정렬
            } else {
                return s1.length() - s2.length(); //반환값이 양수면 s1이 큰 값
            }
        });

        System.out.println(arr[0]);
        for(int i=1; i<num; i++) { //중복 제거
            if(!arr[i].equals(arr[i-1]))  { //이전 것과 문자열을 비교하여 같지 않다면 출력
                System.out.println(arr[i]);
            }
        }
    }
}
