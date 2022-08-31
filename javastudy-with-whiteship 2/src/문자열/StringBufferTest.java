package 문자열;

public class StringBufferTest {
      public static void main(String[] args) {
            StringBuffer sb = new StringBuffer();
            sb.append("Hi");
            sb.append(" ");
            sb.append("My name is");
            sb.append(" ");
            sb.append("minseok jeong.");
            String result= sb.toString();
            System.out.println(result); //Hi My name is  minseok jeong.

            String result2="";
            result2+="Hi";
            result2+=" ";
            result2+="My name is";
            result2+=" ";
            result2+="minseok jeong.";
            System.out.println(result2); //Hi My name is minseok jeong.

            StringBuilder sbd = new StringBuilder();
            sbd.append("Hi");
            sbd.append(" ");
            sbd.append("My name is");
            sbd.append(" ");
            sbd.append("minseok jeong.");
            String result3=sbd.toString();
            System.out.println(result3); //Hi My name is minseok jeong.

            StringBuffer sb2 = new StringBuffer();
            sb2.append("My name is minseok jeong.");
            sb2.insert(0,"Hi ");
            String result4=sb2.toString();
            System.out.println(result4); //Hi My name is minseok jeong.
      }
}
