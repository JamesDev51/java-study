package java_lang_패키지;

public class GetClassTest {
      public static void main(String[] args) {
            //클래스 얻기
            Class cObj = new GetClassTest().getClass();
            Class cObj2=GetClassTest.class;
            try {
                  Class cObj3=Class.forName("java_lang_패키지.GetClassTest");
            } catch (ClassNotFoundException e) {
                  e.printStackTrace();
            }

      }
}
