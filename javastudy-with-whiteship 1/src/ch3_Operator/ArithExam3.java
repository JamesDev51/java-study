package ch3_Operator;

public class ArithExam3 {
      public static void main(String[] args) {
            double num1=1.0;
            double num2=-1.0;
            double num3=0.0;

            System.out.println(num1/num3); //Infinity
            System.out.println(num2/num3); //-Infinity
            System.out.println(num1%num3); //NaN
            System.out.println(num2%num3); //NaN
            System.out.println(num3/num3); //NaN
      }
}
