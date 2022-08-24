package 문자열;

public class LastIndexOf {
      public static void main(String[] args) {
            String s="Hi, My name is minseok";

            System.out.println(s.lastIndexOf("n")); //17
            System.out.println(s.lastIndexOf("k")); //21
            System.out.println(s.lastIndexOf("s")); //18
            System.out.println(s.lastIndexOf(","));  //2
            System.out.println(s.lastIndexOf(" ")); //14
            System.out.println(s.lastIndexOf("z")); //-1
      }
}
