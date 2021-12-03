package ch13_IO;

import java.io.File;

public class IODemo3 {
    public static void main(String[] args){
        File file = new File("./test.txt");
        boolean isExist = file.exists();
        System.out.println(isExist);

    }
}
