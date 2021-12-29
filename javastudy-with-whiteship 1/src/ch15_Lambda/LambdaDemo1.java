package ch15_Lambda;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class LambdaDemo1 {
    public static void main(String[] args) {
        BiConsumer<String,Integer> bc1 = (name, i )-> {
            System.out.println(name + " : "+ i);
        };
        bc1.accept("minseok",23);
        BiConsumer<String,Integer> bc2 = (name, i )-> System.out.println(name + " : "+ i);
        bc2.accept("minseok",23);

    }

}
