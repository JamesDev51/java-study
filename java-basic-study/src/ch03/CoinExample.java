package ch03;

public class CoinExample {
    public static void main(String[] args) {
        //동전 구하기 500, 100, 50, 10
        int money=2680;
        int restMoney=0;

        System.out.println("500원 : "+ (money/500));
        money%=500;
        System.out.println("100원 : "+(money/100));
        money%=100;
        System.out.println("50원 : "+(money/50));
        money%=50;
        System.out.println("50원 : "+(money/10));

    }
}
