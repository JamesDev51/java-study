package ch13_IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IODemo1 {
    public static void main(String[] args) throws IOException {
        //기반 스트림 생성
        FileInputStream fileInputStream = new FileInputStream("test.txt");

        //기반 스트림을 이용해서 보조 스트림을 생성
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        //Buffered**Stream 생성시 사이즈도 정의하여 생성할 수 있다. (default : 8192)
        BufferedInputStream bis = new BufferedInputStream(fileInputStream,8192);

        //보조 스트림을 이용해서 데이터를 읽는다.
        bufferedInputStream.read();
    }
}
