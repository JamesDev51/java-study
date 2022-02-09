package ch6_Inheritance;
class 부모클래스5{
      int a;

      public 부모클래스5(){

      }
      public 부모클래스5(int a) {
            this.a = a;
      }
}

class 자식클래스5 extends 부모클래스5{
      int b;
      public 자식클래스5(int b){
            super();
            this.b=b;
      }
}

public class InheritanceExam5 {
      public static void main(String[] args) {
            자식클래스5 js=new 자식클래스5(3);

      }
}
