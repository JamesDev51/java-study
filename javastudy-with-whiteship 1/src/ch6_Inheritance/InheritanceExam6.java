package ch6_Inheritance;
class 부모클래스6{
      void method1(){}
      void method2(){}
      void method3(){}

}

class 자식클래스6 extends 부모클래스6{
      void method2(){}
      @Override
      void method3(){}
      void method4(){}
}

public class InheritanceExam6 {
      public static void main(String[] args) {
            자식클래스6 js=new 자식클래스6();
            js.method1(); //부모클래스 메서드 호출
            js.method2(); //재정의한 자식 메서드 호출(어노테이션 x)
            js.method3(); //재정의한 자식 메서드 호출(어노테이션 o)
            js.method4(); //자식 메서드 호출
      }
}
