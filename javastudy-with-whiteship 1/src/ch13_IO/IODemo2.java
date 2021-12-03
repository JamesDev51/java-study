package ch13_IO;

public class IODemo2 {
    public static void main(String[] args) {
        int num=6;
        try{
            for(int i=3;i>=0;i--){
                System.out.println("res : "+num/i);
            }
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
