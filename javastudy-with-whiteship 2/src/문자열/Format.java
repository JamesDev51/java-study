package 문자열;

public class Format {
      public static void main(String[] args) {
            int i =123456789;
            System.out.println(String.format("%,d",i));//123,456,789

            float f = 3.141625234f;
            System.out.println(String.format("%.2f",f)); //3.14
      }
}
