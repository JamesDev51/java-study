package ch04.b;

import ch04.a.Cal;

public class App {

    //JVM이 main 메서드를 찾으려면 public, static 필요(공개, 메모리에 올린다는 뜻)
   public static void main(String[] args) {
        Cal cal=new Cal();
        cal.minus();
//        System.out.println(cal.num);
    }
}
