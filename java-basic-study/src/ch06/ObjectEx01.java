package ch06;

class Dog extends  Object{
    String name="토토";
}
class Cat{
    String name="야옹이";
 }

public class ObjectEx01 {
    public static void main(String[] args) {
        Object o1= new Dog();
        Object o2=new Cat();
    }
}
