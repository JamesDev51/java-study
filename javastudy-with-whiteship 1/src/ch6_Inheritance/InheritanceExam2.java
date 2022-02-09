package ch6_Inheritance;
class 부모클래스2{
      public int a=10;
}
class 자식클래스2 extends  부모클래스2{
      public void display(){
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(super.a);
      }
}

public class InheritanceExam2 {
      public static void main(String[] args) {
            자식클래스2 js = new 자식클래스2();
            js.display();
      }
}
