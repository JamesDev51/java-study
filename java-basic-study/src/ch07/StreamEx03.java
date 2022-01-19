package ch07;

import java.io.*;

public class StreamEx03 {
    public static void main(String[] args) {
        InputStream in = System.in;
        InputStreamReader ir = new InputStreamReader(in);
        BufferedReader br= new BufferedReader(ir);

        try{
            String data= br.readLine();
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
