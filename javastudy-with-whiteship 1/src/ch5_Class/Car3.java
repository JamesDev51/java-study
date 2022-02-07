package ch5_Class;

public class Car3 {
      private  String modelName;
      private  int modelYear;
      private  String color;
      private int speed;
      private String direction;

      public Car3(String modelName, int modelYear, String color) {
            this.modelName = modelName;
            this.modelYear = modelYear;
            this.color = color;
            this.speed = 0;
            this.direction = "forward";
      }

      public static void main(String[] args) {
            Car3 아반떼 = new Car3("아반떼",2021,"white");
            System.out.println(아반떼);
      }

      @Override
      public String toString() {
            return "Car3{" +
                        "modelName='" + modelName + '\'' +
                        ", modelYear=" + modelYear +
                        ", color='" + color + '\'' +
                        ", speed=" + speed +
                        ", direction='" + direction + '\'' +
                        '}';
      }
}
