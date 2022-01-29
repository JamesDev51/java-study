package ch2_DataType;

public class PromotionExam {
      public static void main(String[] args) {
            byte byteVal=10;
            int intVal= byteVal; //byte -> int
            System.out.println(intVal); //10

            char charVal='가';
            intVal=charVal; //char -> int
            System.out.println("'가'의 유니코드 : "+intVal); //'가'의 유니코드: 44032

            intVal=500;
            long longVal=intVal; //int -> long
            System.out.println(longVal); //500

            intVal=200;
            double doubleVal = intVal; //int -> douoble
            System.out.println(doubleVal); //200.0
      }
}
