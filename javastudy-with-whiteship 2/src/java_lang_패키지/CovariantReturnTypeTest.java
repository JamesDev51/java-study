package java_lang_패키지;

public class CovariantReturnTypeTest {
      public static void main(String[] args) {
            Parent parent = new Parent();
            Child child = new Child();

            System.out.println(parent.createNewOne().getClass()); //class java_lang_패키지.CovariantReturnTypeTest$Parent
            System.out.println(child.createNewOne().getClass()); //class java_lang_패키지.CovariantReturnTypeTest$Child
      }

      static class Parent{
            Parent createNewOne(){return new Parent();}
      }
      static class Child extends Parent{
            @Override
            Child createNewOne() { //오버라이딩 했지만 반환 타입을 자식형으로 할 수 있음
                  return new Child();
            }
      }
}
