package ch6_Inheritance;
class 부모클래스8{
      void sayHello(){
            System.out.println("안녕하십니까!");
      }
}

class 자식클래스8 extends 부모클래스8{
      void sayHello(){
            System.out.println("안녕!");
      }
}

public class InheritanceExam8 {
      public static void main(String[] args) {
            부모클래스8 bm = new 부모클래스8();
            부모클래스8 js= new 자식클래스8();

            bm.sayHello(); //안녕하십니까!
            js.sayHello(); //안녕!
      }
}
