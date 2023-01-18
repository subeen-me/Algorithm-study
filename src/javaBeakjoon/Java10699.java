package javaBeakjoon;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Java10699 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        System.out.println(format.format(date));
    }
}
