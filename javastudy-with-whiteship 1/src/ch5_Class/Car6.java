package ch5_Class;

public class Car6 {
      private  String modelName;
      private  int modelYear;
      private  String color;
      private int speed;
      private String direction;


      public Car6(String modelName, int modelYear, String color) {
            this(modelName,modelYear,color,0,"forward");
      }

      public Car6(String modelName, int modelYear, String color, int speed, String direction) {
            this.modelName = modelName;
            this.modelYear = modelYear;
            this.color = color;
            this.speed = speed;
            this.direction = direction;
      }

      public static void main(String[] args) {
            Car6 아반떼 = new Car6("아반떼",2021, "white");
            Car6 소나타 = new Car6("소나타",2022,"black",0,"left");
      }
}
