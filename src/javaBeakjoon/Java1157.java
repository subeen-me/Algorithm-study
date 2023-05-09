package javaBeakjoon;

import java.util.Scanner;

public class Java1157 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine().toUpperCase();
        int[] alphabet = new int[26];

        for(int i=0; i<str.length(); i++) { //입력한 알파벳 개수 확인
            int tempNum = str.charAt(i) - 65; //값을 하나씩 가져와서 대문자 -A == -65
            alphabet[tempNum]++; //해당 위치에 ++
        }

        int max = -1; //배열 안 초기값이 0이므로 -1로 지정
        char ch = '?';
        for(int i=0; i<alphabet.length; i++) { //최대값 찾기
            if(alphabet[i] > max) {
                max = alphabet[i];
                ch = (char)(i+65); //대문자로 출력해야하므로 65를 더한다. char 값과 int 값 연산이므로 (char)캐스팅 붙이기.
            } else if (alphabet[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);

    }
}
