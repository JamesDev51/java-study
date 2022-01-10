package ch04;

public class Cat {
    String name;
    String color;
    //Cat() 디폴트 생성자
    //개발자가 생략 가능한 코드
    //내가 직접 생성자를 구현하게 되면 디폴트 생성자가 생성될 수 없다.
    public Cat(){}
    public Cat(String n, String c){
        System.out.println("고양이 탄생함");
        this.name=n;
        this.color=c;

    }
}
