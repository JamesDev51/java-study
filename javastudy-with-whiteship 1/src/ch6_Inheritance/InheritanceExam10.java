package ch6_Inheritance;

import java.util.ArrayList;

class 부모클래스10{
      public final void 걷기(){
            System.out.println("걷기 뚜벅 뚜벅");
      }
}

class 자식클래스10 extends 부모클래스10{
//		@Override
//      public final void 걷기(){
//            System.out.println("걷기 걷기 걷기");
//      }
}

public class InheritanceExam10 {
      public static void main(String[] args) {
            자식클래스10 js = new 자식클래스10();
            js.걷기();
            final ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            System.out.println(arrayList);
//            arrayList= new ArrayList<>();
      }
}
