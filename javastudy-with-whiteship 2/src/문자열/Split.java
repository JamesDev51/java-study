package 문자열;

public class Split {
      public static void main(String[] args) {
            String s="Hi! My name is minseok jeong!";

            String[] strings =s.split(" ");
            for (String string : strings) System.out.print(string+", "); //Hi!, My, name, is, minseok, jeong!

            strings = s.split("!");
            for (String string : strings) System.out.print(string+", "); //Hi,  My name is minseok jeong,

            strings = s.split("");
            for (String string : strings) System.out.print(string+", "); //H, i, !,  , M, y,  , n, a, m, e,  , i, s,  , m, i, n, s, e, o, k,  , j, e, o, n, g, !,
      }
}
