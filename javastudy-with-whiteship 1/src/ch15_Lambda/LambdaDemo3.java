package ch15_Lambda;

public class LambdaDemo3 {
    public static void main(String[] args) {
        MyFunction f = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };
    int bigger = f.max(5,3);
    MyFunction f2= (a,b)->a>b?a:b;
    int bigger2 = f2.max(5,3);

    MyFunction3 f3=  ()->{};
    MyFunction3 f4 = (MyFunction3) ()->{};
    Object f5 = (Object)(MyFunction3) ()->{};
    String f6=((Object)(MyFunction3) ()->{}).toString();
    }
}
