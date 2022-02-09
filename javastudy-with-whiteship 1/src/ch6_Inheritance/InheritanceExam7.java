package ch6_Inheritance;
class 부모클래스7{
      void sayHello(){
            System.out.println("안녕하십니까!");
      }
}

class 자식클래스7 extends 부모클래스7{
      void sayHello(){
            System.out.println("안녕!");
      }
}

public class InheritanceExam7 {
      public static void main(String[] args) {
            부모클래스7 bm = new 부모클래스7();
            자식클래스7 js= new 자식클래스7();

            bm.sayHello();
            js.sayHello();
      }
}
