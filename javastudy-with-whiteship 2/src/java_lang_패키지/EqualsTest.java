package java_lang_패키지;

public class EqualsTest {
      public static void main(String[] args) {
            EqualsTest e1= new EqualsTest(1);
            EqualsTest e2= new EqualsTest(1);

            System.out.println(e1.equals(e2)); //false
      }
      Integer num;

      public EqualsTest(Integer num) {
            this.num = num;
      }
}
