package javaBeakjoon;

import java.util.Scanner;

public class Java1316 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int cnt = 0; //그룹 단어 개수

        for(int i=0; i<n; i++) {
            String str = kb.next();
            boolean check[] = new boolean[26];
            boolean temp = true; //그룹 단어인지 확인

            for(int j=0; j<str.length(); j++) {
                int index = str.charAt(j) -'a';
                if(check[index]) { //이전에 사용한 적이 있는 문자이고
                    if(str.charAt(j) != str.charAt(j-1)) { //이전 문자와 연속되지 않는다면
                        temp = false; //그룹 단어 아님
                        break;
                    }
                } else { //이전에 사용한 적 없는 문자라면
                    check[index] = true; //문자 사용 체크
                }
            }
            if(temp) cnt++;
        }
        System.out.println(cnt);

    }
}
