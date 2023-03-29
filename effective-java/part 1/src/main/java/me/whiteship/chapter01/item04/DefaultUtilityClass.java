package me.whiteship.chapter01.item04;

public class DefaultUtilityClass extends UtilityClass {

    public static void main(String[] args) {
        //서브클래스를 만들면 인스턴스를 만들 수 있게 됨
        DefaultUtilityClass utilityClass = new DefaultUtilityClass();
        utilityClass.hello();
    }
}
