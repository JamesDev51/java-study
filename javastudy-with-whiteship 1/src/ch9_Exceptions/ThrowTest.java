package ch9_Exceptions;

public class ThrowTest {
    private static void printInt(int i){
        if(i<5){
            throw new IllegalArgumentException("i는 5 이상이어야 합니다.");
        }
        System.out.println("i : "+i);
    }
    public static void main(String[] args) {
        try{
            printInt(6);
            printInt(1);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
