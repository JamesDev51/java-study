package ch15_Lambda;

public class LambdaDemo4 {
    static void aMethod(MyFunction2 f2){
        f2.saySomething();
    }
    static MyFunction2 aMethod2(){
        MyFunction2 f = ()->{
            System.out.println("helllllooooo");
        };
        return f;
    }
    static MyFunction2 aMethod3(){
        return ()-> System.out.println("helllllloooooooo2");
    }

    public static void main(String[] args) {
        MyFunction2 f2 = () -> System.out.println("hello guys");
        aMethod(f2);
        aMethod(()-> System.out.println("hi guys"));
    }
}
