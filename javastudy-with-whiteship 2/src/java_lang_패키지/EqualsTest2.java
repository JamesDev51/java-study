package java_lang_패키지;

import java.util.Objects;

public class EqualsTest2 {
      public static void main(String[] args) {
            EqualsTest2 e1= new EqualsTest2(1);
            EqualsTest2 e2= new EqualsTest2(1);

            System.out.println(e1.equals(e2)); //true
      }
      Integer num;

      public EqualsTest2(Integer num) {
            this.num = num;
      }

      @Override
      public boolean equals(Object obj) {
            return Objects.equals(this.num, ((EqualsTest2) obj).num);
      }
}
