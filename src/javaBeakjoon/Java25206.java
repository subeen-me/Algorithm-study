package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String str[] = new String[20];
        double totalSum = 0; //전공과목합(학점*과목평점)
        double scoreSum = 0; //학점의 총합
        String gradeList[] = {"A+","A0","B+","B0","C+","C0","D+","D0","F","P"};
        double gradeScore[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        for(int i=0; i<20; i++) {
            str[i] = bfr.readLine();
            StringTokenizer st = new StringTokenizer(str[i], " ");
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken()); //학점
            String grade = st.nextToken(); //등급

            for (int j=0; j<10; j++) {
                if(grade.equals(gradeList[j])) {
                    totalSum += score * gradeScore[j];
                    if(j != 9) { //등급이 P가 아닐 때만
                        scoreSum += score; //학점 총합에 학점을 더한다
                    }
                }
            }
        }

        double average = totalSum / scoreSum;
        System.out.printf("%.6f\n", average);

        bfr.close();
    }
}
