package ch15_Lambda;

@FunctionalInterface
interface MyFunction4{
    void myMethod();
}

class Outer{
    int val=10;
    class Inner{
        int val= 20;

        void method(int i){  //void method(final int i)
            int val=30;             //final int val =30;
//            i = 10;                   //Error 상수의 값은 변경 불가능
//            val=20;                //Error  상수의 값은 변경 불가능

            MyFunction4 f = ()->{
                System.out.println("i: " + i);
                System.out.println("val : "+val);
                System.out.println("this.val : " + ++this.val);
                System.out.println("Outer.this.val : " + ++Outer.this.val);
            };
            f.myMethod();
        }
    }   //End Of Inner
}       //End Of Outer


public class LambdaDemo6 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(100);
    }
}
