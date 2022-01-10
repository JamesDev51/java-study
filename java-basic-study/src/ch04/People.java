package ch04;

public class People {
    String name;
    int age;

    //디폴트 생성자가 있을까요?
    public People(String name, int age){
        System.out.println("People 메서드 스택 name : "+name);
        System.out.println("People 메서드 스택 name : "+age);
        this.name=name;
        this.age=age;
    }
}
