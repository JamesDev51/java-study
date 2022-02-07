package ch5_Class;

public class Car2 {
      private  String modelName;
      private  int modelYear;
      private  String color;
      private int speed;
      private String direction;

      public static void main(String[] args) {
            Car2 car = new Car2();
            System.out.println(car);
      }

      @Override
      public String toString() {
            return "Car2{" +
                        "modelName='" + modelName + '\'' +
                        ", modelYear=" + modelYear +
                        ", color='" + color + '\'' +
                        ", speed=" + speed +
                        ", direction='" + direction + '\'' +
                        '}';
      }
}
