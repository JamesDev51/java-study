package 문자열;

public class Matches {
      public static void main(String[] args) {
            int i =123456;
            String s1 = String.format("%,d",i); //123,456
            String s2 = "123456"; //123456

            boolean matcher = s1.matches(s2);
            System.out.println(matcher); //false
      }
}
