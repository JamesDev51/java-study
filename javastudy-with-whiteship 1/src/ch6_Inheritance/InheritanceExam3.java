package ch6_Inheritance;
class 부모클래스3{
      public int a=10;
}

class 자식클래스3 extends  부모클래스3{
      public int a=5; //자식  클래스 인스턴스 변수 추가
      public void display(){
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(super.a);
      }
}

public class InheritanceExam3 {
      public static void main(String[] args) {
            자식클래스3 js = new 자식클래스3();
            js.display();
      }
}
