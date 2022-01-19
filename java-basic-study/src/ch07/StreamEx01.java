package ch07;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        InputStream in = System.in;
        try {
            int data=in.read();
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
