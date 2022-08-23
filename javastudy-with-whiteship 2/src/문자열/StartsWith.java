package 문자열;

public class StartsWith {
      public static void main(String[] args) {
            String s = "My name is minseok jeong";

            //startsWith(String prefix)
            System.out.println(s.startsWith("M")); //true
            System.out.println(s.startsWith("My")); //true
            System.out.println(s.startsWith("book")); //false

            //startsWith(String prefix, int toOffSet)
            System.out.println(s.startsWith("n",3)); //true
            System.out.println(s.startsWith("m",5)); //true
            System.out.println(s.startsWith("n",6)); //false
      }
}
