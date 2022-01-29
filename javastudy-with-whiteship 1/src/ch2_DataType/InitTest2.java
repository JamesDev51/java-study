package ch2_DataType;

public class InitTest2 {

      static int cv=1; //클래스 변수
      int iv=1; //인스턴스 변수

      //클래스 초기화 블럭
      static {
            cv=2;
      }

      //인스턴스 초기화 블럭
      {
            iv=2;
      }

      //생성자
      InitTest2(){
            iv=3;
      }
}
