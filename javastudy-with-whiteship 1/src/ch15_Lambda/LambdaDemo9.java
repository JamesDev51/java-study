package ch15_Lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaDemo9 {
    static Integer stringToInt(String s){
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Function<String, Integer> f= s -> Integer.parseInt(s);
        Function<String,Integer> f2=Integer::parseInt;

        BiFunction<String,String,Boolean> b = (s1,s2)->s1.equals(s2);
        BiFunction<String,String,Boolean> b2= String::equals;

    }
}
