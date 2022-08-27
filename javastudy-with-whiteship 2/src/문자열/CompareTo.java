package 문자열;

public class CompareTo {
      public static void main(String[] args) {
            String s1 ="ABCD A";
            String s2 = "ABCD a";
            String s3 = "ABCD b";
            String s4 = "B";
            String s5 = "ABCD A";

            System.out.println(s1.compareTo(s2)); //-32
            System.out.println(s1.compareTo(s3)); //-33
            System.out.println(s1.compareTo(s4)); //-1
            System.out.println(s1.compareTo(s5)); //0

            System.out.println(s2.compareTo(s1)); //32
            System.out.println(s3.compareTo(s1)); //33
            System.out.println(s4.compareTo(s1)); //1
            System.out.println(s5.compareTo(s1)); //0
      }
}
