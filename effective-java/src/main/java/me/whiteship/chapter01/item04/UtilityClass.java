package me.whiteship.chapter01.item04;

import org.springframework.context.annotation.AnnotationConfigUtils;

public abstract class UtilityClass {

    /**
     * 이 클래스는 인스턴스를 만들 수 없습니다.
     */
   private UtilityClass() {
     //Throwable 밑에 있는 Error -> 예외 처리를 위함이 아님 (만나면 안되는 상황 / 쓰면 안되는 상황)
       throw new AssertionError();
   }

    public static String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        String hello = UtilityClass.hello();

        //인스턴스를 만들 필요 없지만 만들어짐
        UtilityClass utilityClass = new UtilityClass();
        utilityClass.hello();

    }
}
