package 문자열;

public class IndexOf {
      public static void main(String[] args) {
            String s="Hi, My name is minseok";

            System.out.println(s.indexOf("n")); //7
            System.out.println(s.indexOf("i")); //1
            System.out.println(s.indexOf("k")); //21
            System.out.println(s.indexOf(",")); //2
            System.out.println(s.indexOf(" ")); //3
            System.out.println(s.indexOf("z")); //-1
      }
}
