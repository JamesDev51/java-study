package ch9_Exceptions;

import java.util.ArrayList;
import java.util.List;

public class NullPointerExceptionExample {
    public static void process(String str){
        List<String> list = new ArrayList<>();
        try{
            System.out.println("str 의 길이 : " +str.length());
            System.out.println("list의 0번 요소 : " + list.get(1));
        }catch(RuntimeException e){
            System.out.println("RuntimeException 발생 ");
        }
    }

    public static void main(String[] args) {
        process(null);
        process("hello");
    }
}
