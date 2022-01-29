package ch9_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        InputStream is=null;
        try {
            is  = new FileInputStream("");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException 발생");
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
