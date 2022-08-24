package 문자열;

public class ReplaceAll {
      public static void main(String[] args) {
            String s = "aaaaaaabbbcccccdddddabcdeeeeabceee";

            String res1=s.replace("abc","왕");
            String res2=s.replaceAll("[abc]","왕");

            System.out.println("replace result -> "+res1);  //aaaaaaabbbcccccddddd왕deeeeeeeeee
            System.out.println("replaceAll result -> "+res2); //왕왕왕왕왕왕왕왕왕왕왕왕왕왕왕ddddd왕왕왕deeee왕왕왕eee

      }
}
