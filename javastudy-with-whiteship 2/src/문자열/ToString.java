package 문자열;

public class ToString {

      static class Minseok{
            Integer age = 24;
            String name="minseok jeong";
            String sex="male";

            @Override
            public String toString() {
                  return "Minseok{" +
                              "age=" + this.age +
                              ", name='" + this.name + '\'' +
                              ", sex='" + this. sex + '\'' +
                              '}';
            }
      }
      public static void main(String[] args) {
            System.out.println(new Minseok()); //Minseok{age=24, name='minseok jeong', sex='male'}
      }
}
