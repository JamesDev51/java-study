package ch9_Exceptions;

public class finallyBlockTest {
    public static void main(String[] args) {
        String str=null;
        try{
            str="try 블럭";
            System.out.println(str);
        }finally {
            str="여기는 finally 블럭";
            System.out.println(str);
        }
    }
}
