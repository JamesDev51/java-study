package ch05;

class 요리사{
    String name ="요리사";
}
// 홍길동 or 요리사
class 홍길동 extends ch05.srpdip.요리사 {
    String name="홍길동";
}

public class OOPEx03    {
    public static void main(String[] args) {
        ch05.srpdip.홍길동 h1 = new ch05.srpdip.홍길동(); //(홍길동, 요리사)
        System.out.println(h1.name);

        ch05.srpdip.요리사 y1 = new ch05.srpdip.홍길동(); //(홍길동, 요리사)
        System.out.println(y1.name);

//        홍길동 h2 = new 요리사();
    }
}
