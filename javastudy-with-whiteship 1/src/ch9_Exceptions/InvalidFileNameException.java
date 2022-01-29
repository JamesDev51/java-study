package ch9_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InvalidFileNameException extends  Exception{
    public InvalidFileNameException(String message, Throwable cause) {
        super(cause);
        System.out.println("IFNE : "+message);
    }
    public static void processFile(String fileName) throws InvalidFileNameException, FileNotFoundException{
        try{
            new FileInputStream(fileName);
        }catch(FileNotFoundException e){
            if(fileName.length()<1){
                throw new InvalidFileNameException("파일 이름에 문제있음",e);
            }
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            processFile("");
        } catch (InvalidFileNameException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
