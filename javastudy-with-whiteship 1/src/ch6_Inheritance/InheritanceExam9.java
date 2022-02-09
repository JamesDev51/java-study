package ch6_Inheritance;

abstract class 사람{
      public void 숨쉬기(){
            System.out.println("들숨! 날숨!");
      }
      public abstract void 자기소개하기(String name);
}

class 길동 extends 사람{
      @Override
      public void 자기소개하기(String name) {
            System.out.println("제 이름은 " + name + " 입니다.");
      }
}
class 철수 extends 사람{
      @Override
      public void 자기소개하기(String name) {
            System.out.println("내 이름은 " + name + " 다.  만나서 반갑다!");
      }
}

public class InheritanceExam9 {
      public static void main(String[] args) {
            길동 길동 = new 길동();
            철수 철수 = new 철수();

            길동.숨쉬기();
            길동.자기소개하기("길동");

            철수.숨쉬기();
            철수.자기소개하기("철수");

      }
}
