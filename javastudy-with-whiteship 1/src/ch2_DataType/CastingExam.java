package ch2_DataType;

public class CastingExam {
      public static void main(String[] args) {
            int intVal=44032;
            char charVal = (char)intVal; //44032에 해당되는 유니코드 ''가' 출력
            System.out.println(charVal); //'가'

            long longVal = 500;
            intVal = (int) longVal;
            System.out.println(intVal); // 500

            double doubleVal= 3.14;
            intVal=(int) doubleVal; //정수부인 3만 들어감
            System.out.println(intVal); //3
      }
}
