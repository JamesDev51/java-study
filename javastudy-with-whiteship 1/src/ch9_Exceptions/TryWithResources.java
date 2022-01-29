package ch9_Exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {
    public static void main(String[] args){
//        InputStream is=null;
//        try {
//            is = new FileInputStream("");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }finally {
//                is.close();
//        }
        try(InputStream is= new FileInputStream("")){
            //is를 사용하는 코드
        }catch(IOException e){
            System.out.println("IOException 발생 : "+e.getMessage());
        }
    }
}
