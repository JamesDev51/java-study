package ch5_Class;

public class Car {
      private final String modelName;
      private final int modelYear;
      private final String color;
      private int speed;
      private String direction;

      public Car(String modelName, int modelYear, String color) {
            this.modelName = modelName;
            this.modelYear = modelYear;
            this.color = color;
            this.speed = 0;
            this.direction = "forward";
      }
      public void speedUp(){
            this.speed+=10;
      }
      public void speedDown(){
            this.speed-=10;
      }
      public void changeDirection(int d){
            if(d==0) this.direction="forward";
            else if(d==1) this.direction="reverse";
            else if(d==2) this.direction="right";
            else if(d==3) this.direction="left";
            else System.out.println("Can't set the direction");
      }

      @Override
      public String toString() {
            return "Car{" +
                        "modelName='" + modelName + '\'' +
                        ", modelYear=" + modelYear +
                        ", color='" + color + '\'' +
                        '}';
      }

      public static void main(String[] args) {
            Car 아반떼 = new Car("아반떼",2021,"white");
            Car 소나타 = new Car("소나타",2020,"silver");
            Car 그렌저 = new Car("그렌저",2021,"black");

            new Car("재사용 불가능한 차",2015,"red"); //생성은 가능하지만 재사용은 불가능 -> 다시 참조가 불가능하기 때문(메모리 어딘가에 있음)

            Car car; //클래스 변수를 생성
            car = new Car("자동차 1",2020,"blue"); // 존재하는 클래스 변수에 동적으로 할당

            Car car2 = new Car("자동차 2",2022,"green"); // 클래스 변수를 생성하면서 바로 동적으로 할당

      }
}
