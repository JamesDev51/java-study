package me.whiteship.chapter01.item09.suppress;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TopLine {
    // 코드 9-1 try-finally - 더 이상 자원을 회수하는 최선의 방책이 아니다! (47쪽)
    static String firstLineOfFile(String path) throws IOException {
        try(BufferedReader br = new BadBufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    static String badFirstLineOfFile(String path) throws IOException {
        BufferedReader br = new BadBufferedReader(new FileReader(path));
        try{
            return br.readLine();
        }finally {
            br.close(); //여기서 발생한 예외가 readLine()에서 발생한 예외를 먹어버림 -> 디버깅 불가능
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(firstLineOfFile("pom.xml"));
    }
}
