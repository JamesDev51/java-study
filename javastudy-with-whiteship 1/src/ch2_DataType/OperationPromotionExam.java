package ch2_DataType;

public class OperationPromotionExam {
      public static void main(String[] args) {
            byte byteVal1= 10;
            byte byteVal2= 20;
//            byte byteVal3 = byteVal1 + byteVal2; 컴파일 에러 -> 연산결과가 int형이기 때문

            int intVal1= byteVal1+byteVal2;
            System.out.println(intVal1); //30

            char charVal1='A';
            char charVal2=1;
            //char charVal3 = charVal1 + charVal2; //컴파일 에러 -> 연산결과가 int형이기 때문

            int intVal2= charVal1 + charVal2; // 65+1
            System.out.println("유니코드 = " + intVal2); //66
            System.out.println("출력문자 : "+(char) intVal2); //'B'

            int intVal3 = 10;
            int intVal4 = intVal3 / 4; //int형 연산, 소수점 버려짐

            System.out.println(intVal4); //2

            int  intVal5=10;
            //int intVal6 = intVal5 /4.0 컴파일 에러 -> 연산결과가 double이기 때문
            double doubleVal =intVal5/4.0;

            System.out.println(doubleVal);//2.5

      }
}
