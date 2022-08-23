package 문자열;

public class Equals {
      public static void main(String[] args) {
            String s1="Hi, My name is minseok";
            String s2="Hi, My name is minseok";
            String s3="Hi, My name is minseok jeong";
            String s4= new String("Hi, My name is minseok");
            String s5=s1;
            String s6=s4;


            System.out.println(s1.equals(s2)); //true
            System.out.println(s2.equals(s1)); //true
            System.out.println(s1.equals(s3)); //false
            System.out.println(s2.equals(s3)); //false

            System.out.println(s1==s2); //true
            System.out.println(s2==s3); //false
            System.out.println(s1==s4); //false
            System.out.println(s1==s5); //true
            System.out.println(s4==s6); //true
      }
}
