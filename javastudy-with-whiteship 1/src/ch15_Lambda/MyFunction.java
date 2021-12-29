package ch15_Lambda;

@FunctionalInterface
public interface MyFunction {
     int max(int a, int b);
     static int min(int a,int b){
         return Math.min(a,b);
     }
     default int firstNumber(int a, int b){
         return a;
     }
}
