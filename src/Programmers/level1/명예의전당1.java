package Programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 명예의전당1 {
    public int[] solution(int k, int[] score) {

        int days = score.length;
        int[] answer = new int[days]; //최하위 발표점수
        List<Integer> list = new ArrayList<>(); //명예의 전당. 높은점수들

        for(int i=0; i<days; i++) {
            if(list.size() < k) {
                list.add(score[i]);
            } else {
                if(list.get(0) < score[i]) {
                    list.set(0, score[i]);
                }
            }

            Collections.sort(list); //명예의 전당 순위정렬
            answer[i] = list.get(0); //발표점수에 전당 제일 낮은 점수 추가
        }

        return answer;
    }
}
