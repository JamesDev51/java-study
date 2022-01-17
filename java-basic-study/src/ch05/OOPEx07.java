package ch05;

abstract class Animal{
    abstract void speak(); //추상메서드 ( 몸체 {}가 없다)
    void Hello(){
        System.out.println("!!!");
    }
}


class Dog extends Animal{
    void speak(){
        System.out.println("멍멍");
    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("야옹");
    }
}
class Bird extends Animal{
    //추상메서드를 부모가 가지고 있으면 자식은 추상메서드를 반드시 구현해야한다.
    @Override
    void speak() {
        System.out.println("짹짹");
    }
}

public class OOPEx07 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.speak(); //동적바인딩 됨. 왜? 부모 메서드가 무효화됨
        a2.speak();
    }
}
