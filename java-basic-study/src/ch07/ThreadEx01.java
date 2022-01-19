package ch07;

//SubThread -> Runnable
class SubThread implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<6;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("서브 쓰레드 : "+i);
        }
    }
}

public class ThreadEx01 {
    //자바의 메인 스레드
    public static void main(String[] args) {
        SubThread st =new SubThread();
        Thread t1 = new Thread(st);
        t1.start(); //run 메서드 실행
        for(int i=1;i<6;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("메인 쓰레드 : "+i);
        }
    }
}
