package Programmers.level1;

public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long amount = 0;

        for(int i=1; i<=count; i++) {
            amount += price * i;
        }

        if(amount > money)
            return amount - money;
        else
            return 0;
    }
}
