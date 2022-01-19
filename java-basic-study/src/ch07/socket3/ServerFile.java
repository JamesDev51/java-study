package ch07.socket3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile {

    static ServerSocket serverSocket; //클라이언트 연결 받는 소켓
    Socket socket; //실제 통신을 하는 소켓
    BufferedReader br;

    BufferedWriter bw; //새로운 스레드가 필요함
    BufferedReader keyboard; //새로운 스레드가 필요함


    public ServerFile() {
        System.out.println("1. 서버 소켓 시작=======================");
        try{
            serverSocket = new ServerSocket(10000);
            System.out.println("2. 서버 소켓 생성완료 : 클라이언트 접속 대기중===========================");
            socket = serverSocket.accept();
            System.out.println("3. 클라이언트 연결 완료");

            br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            keyboard=new BufferedReader(new InputStreamReader(System.in));
            bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            WriteThread wt = new WriteThread();
            Thread t1 = new Thread(wt);
            t1.start();

            //main 스레드 역할
            while (true) {
                String msg = br.readLine();
                System.out.println("4. 클라이언트로부터 받은 메시지 : "+msg);
            }
        }catch(Exception e){
            System.out.println("서버 소켓 에러 발생함  : "+e.getMessage());
        }
    }

    //내부 클래스
    class WriteThread implements  Runnable{
        @Override
        public void run() {
            while(true){
                try {
                    String keyboardMsg = keyboard.readLine();
                    bw.write(keyboardMsg+"\n");
                    bw.flush();
                } catch (IOException e) {
                    System.out.println("서버소켓쪽에서 키보드 입력 받는 중 오류 발생 : "+e.getMessage());
//                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] args) {
        new ServerFile();

    }
}
