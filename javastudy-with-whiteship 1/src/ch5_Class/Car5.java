package ch5_Class;

public class Car5 {
      private  String modelName;
      private  int modelYear;
      private  String color;
      private int speed;
      private String direction;

      public Car5(String modelName, int modelYear, String color) {
            this.modelName = modelName;
            this.modelYear = modelYear;
            this.color = color;
            this.speed = 0;
            this.direction = "forward";
      }

      public void setSpeed(int speed){
            this.speed=speed;
      }
      public void setDirection(String direction){
            this.direction=direction;
      }
}
