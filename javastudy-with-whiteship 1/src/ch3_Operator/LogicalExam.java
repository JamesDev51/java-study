package ch3_Operator;

public class LogicalExam {
      public static void main(String[] args) {
            // &&
            System.out.println((1==1) && (3>=1)); //true
            System.out.println((1!=1) && (3>=1)); //false
            System.out.println((1!=1) && (3<=1)); //false
            System.out.println();

            // ||
            System.out.println((1==1) || (3>=1)); //true
            System.out.println((1!=1) || (3>=1)); //true
            System.out.println((1!=1) || (3<=1)); //false
            System.out.println();

            // !
            System.out.println(!(1==1)); //false
            System.out.println(!(1!=1)); //true
            System.out.println(!(1!=1) || (3<=1)); //true
            System.out.println();
      }
}
