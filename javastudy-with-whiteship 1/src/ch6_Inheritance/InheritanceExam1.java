package ch6_Inheritance;
class 부모클래스{
      private int age=3;
      public int height=10;

      public int getAge() {
            return age;
      }

      public int getHeight() {
            return height;
      }
}

class 자식클래스 extends 부모클래스{

}
public class InheritanceExam1 {
      public static void main(String[] args) {
            자식클래스 js=new 자식클래스();
            System.out.println(js.getAge());
            System.out.println(js.getHeight());
            System.out.println(js.height);
//            System.out.println(js.age); //접근 불가능
      }
}
