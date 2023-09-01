package Programmers.level1;
import java.util.*;

public class 문자열내p와y의개수 {
    public static void main(String[] args) {
      Solution solution = new Solution();
      boolean answer = solution.solution("pPooyY");
        System.out.println(answer);
    }

    static class Solution {
        boolean solution(String s) {
            boolean answer = false;

            char[] arr = s.toLowerCase().toCharArray();

            int pCount = 0;
            int yCount = 0;

            for(char a : arr) {
                if(a == 'p') {
                    pCount++;
                } else if(a == 'y') {
                    yCount++;
                }
            }

            if(pCount == yCount)
                answer = true;

            return answer;
        }
    }
}
