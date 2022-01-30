package ch3_Operator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class InstanceOfExam {
      public static void main(String[] args) {
            String something="가나다";
            System.out.println(something instanceof String); //true
            Integer someNum=3;
            System.out.println(someNum instanceof Integer); //true
            System.out.println();

            List<String> list=  new ArrayList<>();
            System.out.println(list instanceof ArrayList); //true
            System.out.println(list instanceof  List); //true
            System.out.println(list instanceof Set); //false
            System.out.println(list instanceof Collection); //true
            System.out.println(list instanceof Object); //true
            System.out.println();

            ArrayList<String> list2= null;
            System.out.println(list2 instanceof ArrayList); //false
            System.out.println(list2 instanceof  List); //false
            System.out.println(list2 instanceof Set); //false
            System.out.println(list2 instanceof Collection); //false
            System.out.println(list2 instanceof Object); //false
            System.out.println();
      }
}
