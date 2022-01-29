package ch2_DataType;

public class Car2 {
      int door=4; //기본형 변수의 초기화
      Engine engine= new Engine(); //참조형 변수의 초기화
      static int count=0;
      int serialNo;
      String color;
      String gearType;

      {
            count++;
            serialNo=count;
      }

      public Car2() {
            color="white";
            gearType="auto";
      }

      public Car2(String color, String gearType) {
            this.color = color;
            this.gearType = gearType;
      }
}
