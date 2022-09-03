package java_lang_패키지;

public class HashCodeTest {
      public static void main(String[] args) {
            HashCodeTest hashCodeTest1 = new HashCodeTest();
            HashCodeTest hashCodeTest2 = new HashCodeTest();
            System.out.println("hashcode of HCT1 : "+hashCodeTest1.hashCode());
            System.out.println("hashcode of HCT2 : "+hashCodeTest2.hashCode());
            System.out.println(hashCodeTest1.hashCode()==hashCodeTest2.hashCode()); //false
            System.out.println();

            String s1="hello";
            String s2="hello";
            System.out.println("hashcode of s1 : "+s1.hashCode());
            System.out.println("hashcode of s2 : "+s2.hashCode());
            System.out.println(s1.hashCode()==s2.hashCode()); //true
      }
}
