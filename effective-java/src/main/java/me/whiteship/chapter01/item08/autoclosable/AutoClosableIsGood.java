package me.whiteship.chapter01.item08.autoclosable;

import java.io.*;

public class AutoClosableIsGood implements Closeable {

    private BufferedReader reader;

    public AutoClosableIsGood(String path) {
        try {
            this.reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(path);
        }
    }

    @Override
    public void close() {
        try {
            reader.close(); //IOException이 발생 
        } catch (IOException e) {
            throw new RuntimeException(e); //IOException을 RuntimeException 계열로 변환
        }
    }
}
