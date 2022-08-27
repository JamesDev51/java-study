package 문자열;

public class CharAt {
      public static void main(String[] args) {
            String s = "abcdefghijklm";

            System.out.println(s.charAt(3)); //d
            System.out.println(s.charAt(10)); //k
            System.out.println(s.charAt(13)); //.StringIndexOutOfBoundsException
      }
}
