package ch15_Lambda;

import java.util.function.Function;
import java.util.function.Supplier;

class MyClass4{
    int iv;
    MyClass4(){}
    MyClass4(int iv){
        this.iv=iv;
    }
}

public class LambdaDemo12 {
    public static void main(String[] args) {
        Function<String, Integer> f= s-> Integer.parseInt(s);
        Function<String, Integer>f2= Integer::parseInt;

        System.out.println(f.apply("100")+200);
        System.out.println(f2.apply("200")+300);

        Supplier<MyClass4> s = () -> new MyClass4();
        Supplier<MyClass4> s2=MyClass4::new;

        System.out.println(s.get());
        System.out.println(s2.get());

        Function<Integer, MyClass4> f3 = MyClass4::new;
        MyClass4 m = f3.apply(100);

        System.out.println(m.iv);
        System.out.println(f3.apply(200).iv);

        Function<Integer, int[]> f4 = int[]::new;
        System.out.println(f4.apply(10).length);
    }
}
