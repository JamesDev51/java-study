package ch5_Class;

public class Car4 {
      private  String modelName;
      private  int modelYear;
      private  String color;
      private int speed;
      private String direction;

      public Car4() {
      }

      public Car4(String modelName, int modelYear, String color) {
            this.modelName = modelName;
            this.modelYear = modelYear;
            this.color = color;
            this.speed = 0;
            this.direction = "forward";
      }

      public static void main(String[] args) {
            Car4 아반떼 = new Car4("아반떼",2021,"white");
            Car4 car = new Car4();
            System.out.println(아반떼);
      }

      @Override
      public String toString() {
            return "Car4{" +
                        "modelName='" + modelName + '\'' +
                        ", modelYear=" + modelYear +
                        ", color='" + color + '\'' +
                        ", speed=" + speed +
                        ", direction='" + direction + '\'' +
                        '}';
      }
}
