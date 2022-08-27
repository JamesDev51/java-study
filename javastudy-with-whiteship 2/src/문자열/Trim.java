package 문자열;

public class Trim {
      public static void main(String[] args) {
            String s = "     Hello, My name is Minseok Jeong          ";

            System.out.println(s); //     Hello, My name is Minseok Jeong
            System.out.println(s.trim()); //Hello, My name is Minseok Jeong
            System.out.println(s.replace(" ", "")); //Hello,MynameisMinseokJeong
      }
}
