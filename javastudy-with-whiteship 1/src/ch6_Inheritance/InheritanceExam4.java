package ch6_Inheritance;
class 부모클래스4{
      public int a=10;
}

class 자식클래스4 extends  부모클래스4{
      public int a=5;

      public void display(){
            int a=3; //자식  클래스 로컬 변수 추가
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(super.a);
      }
}

public class InheritanceExam4 {
      public static void main(String[] args) {
            자식클래스4 js = new 자식클래스4();
            js.display();
      }
}
