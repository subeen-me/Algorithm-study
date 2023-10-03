package Programmers.level1;

public class 최소직사각형 {
    public int solution(int[][] sizes) {

        int ansMax = 0;
        int ansMin = 0;

        for(int i=0; i<sizes.length; i++) {

            int[] size = sizes[i];

            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);

            ansMax = Math.max(ansMax, max);
            ansMin = Math.max(ansMin, min);
        }

        return ansMax * ansMin;
    }
}
