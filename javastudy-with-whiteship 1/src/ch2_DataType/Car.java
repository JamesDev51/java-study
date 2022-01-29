package ch2_DataType;

public class Car {
      int door=4; //기본형 변수의 초기화
      Engine engine= new Engine(); //참조형 변수의 초기화
      static int count=0;
      int serialNo;
      String color;
      String gearType;

      public Car() {
            count++; //코드 중복
            serialNo=count; //코드 중복
            color="white";
            gearType="auto";
      }

      public Car(String color, String gearType) {
            count++; //코드 중복
            serialNo=count; //코드 중복
            this.color = color;
            this.gearType = gearType;
      }
}
