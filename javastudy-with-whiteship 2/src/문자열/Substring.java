package 문자열;

public class Substring {
      public static void main(String[] args) {
            String s="Hi, My name is minseok";

            //5부터 끝까지
            System.out.println(s.substring(4)); //My name is minseok

            //7부터 11 전까지
            System.out.println(s.substring(7,11)); //name

            //마지막 7글자 자르기
            System.out.println(s.substring(s.length()-7)); //minseok

            //특정 문자 이후의 문자열
            System.out.println(s.substring(s.lastIndexOf(",")+1)); // My name is minseok
      }
}
