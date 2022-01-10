package ch03;

public class CaseEx01 {
    public static void main(String[] args) {
        //캐스팅(다운캐스팅, 업캐스팅)
        int n1=100; //4 Byte
        double d1=n1; // 8 Byte (8 Byte <- 4 Byte)
        System.out.println(d1); //업캐스팅(묵시적)

        double d2=100.8;
        int n2 =(int) d2; //다운캐스팅(명시적 형변환)
        System.out.println(n2); //단점: 데이터가 유실될 수 있다.

        int money=130;
        System.out.println(130/100);
        System.out.println(money/100);
        System.out.println(money/100.0); //int /double -> double
    }
}
