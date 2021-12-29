package ch15_Lambda;

import java.util.function.IntBinaryOperator;

public class LambdaDemo2 {
    public static void main(String[] args) {
        new Object(){
            int max(int a, int b){
                return a>b? a:b;
            }
        };

        final IntBinaryOperator intBinaryOperator = (int a, int b) -> a > b ? a : b;
        intBinaryOperator.applyAsInt(3,5);
    }
}
