package 문자열;

public class Replace {
      public static void main(String[] args) {
            String s="Hi, My name is minseok";

            System.out.println(s.replace("M","P")); //Hi, Py name is minseok
            System.out.println(s.replace(",","!"));    //Hi! My name is minseok
            System.out.println(s.replace("e","u")); //Hi, My namu is minsuok
            System.out.println(s.replace("i","hi"));  //Hhi, My name his mhinseok
            System.out.println(s.replace("z","q"));  //Hi, My name is minseok
      }
}
