package java_lang_패키지;

public class ToStringTest {
      public static void main(String[] args) {
            ToStringTest toStringTest1 = new ToStringTest();
            System.out.println(toStringTest1.toString()); //java_lang_패키지.ToStringTest@1d251891

            ToStringTest toStringTest2 = new ToStringTest(){
                  @Override
                  public String toString() {
                        return this.getClass() + " : 오버라이딩 된 toString()"; //class java_lang_패키지.ToStringTest$1 : 오버라이딩 된 toString()
                  }
            };
            System.out.println(toStringTest2.toString());
      }
}
