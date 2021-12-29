package ch15_Lambda;

import java.util.function.Function;

public class LambdaDemo10 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Function<String,Boolean> f = x -> myClass.equals(x);
        Function<String,Boolean> f2= myClass::equals;
    }
}
