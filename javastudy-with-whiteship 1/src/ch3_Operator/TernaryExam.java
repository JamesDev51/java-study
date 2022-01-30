package ch3_Operator;

public class TernaryExam {
      public static void main(String[] args) {
            int num1=5;
            int num2=7;
            int result;

            result=(num1-num2>=0)? num1:num2;
            System.out.println("num1, num2중에 더 큰 수 : " + result); // num1, num2중에 더 큰 수 : 7
      }
}
