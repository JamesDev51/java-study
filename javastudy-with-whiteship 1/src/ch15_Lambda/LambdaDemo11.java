package ch15_Lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaDemo11 {
    public static void main(String[] args) {
        Supplier<MyClass> s1 = ()->new MyClass(); //람다식
        Supplier<MyClass> s2= MyClass::new; //생성자 메서드 참조

        Function<Integer,MyClass2> f = i -> new MyClass2(i); //람다식
        Function<Integer,MyClass2> f2 = MyClass2::new; //생성자 메서드 참조

        BiFunction<Integer,String,MyClass3> bf = (i,s)-> new MyClass3(i,s); //람다식
        BiFunction<Integer,String,MyClass3> bf2 = MyClass3::new; //생성자 메서드 참조

        Function<Integer,int[]> f3 = x -> new int[x]; //람다식
        Function<Integer, int[]> f4 = int[]::new; //생성자 메서드 참조
    }
}
