package ch07.socket3;

import java.io.*;
import java.net.Socket;

public class ClientFile {

    Socket socket;
    BufferedWriter bw;
    BufferedReader keyboard;
    BufferedReader br;

    public ClientFile() {
        try {
            System.out.println("1. 클라이언트 소켓 시작=======================");
            socket= new Socket("localhost",10000);

            System.out.println("2. 버퍼 연결 완료");
            bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            //키보드 연결
            System.out.println("3. 키보드 스트림 + 버퍼 연결 완료==========");
            keyboard=new BufferedReader(new InputStreamReader(System.in));

            br=new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //새로운 스레드의 역할(글 읽기)
            ReadThread rt= new ReadThread();
            Thread t1= new Thread(rt);
            t1.start();


            //메인 스레드의 역할(글  쓰기)
            while (true) {
                System.out.println("4. 키보드 메시지 입력 대기중 ===========");
                String keyBoardMsg= keyboard.readLine();
                //메시지 끝을 알려줘야 한다. \n
                bw.write(keyBoardMsg+"\n");
                bw.flush();
            }

        } catch (Exception e) {
            System.out.println("클라이언트 소켓 에러 발생함 : "+e.getMessage());
        }
    }

    class ReadThread implements  Runnable{
        @Override
        public void run() {
            while (true) {
                try {
                    String msg= br.readLine();
                    System.out.println("서버로부터 받은 메시지 : "+msg);
                } catch (IOException e) {
                    System.out.println("클라이언트소켓쪽에서 서버소켓 메세지를 입력 받는 중 오류 발생 : "+e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        new ClientFile();
    }
}
