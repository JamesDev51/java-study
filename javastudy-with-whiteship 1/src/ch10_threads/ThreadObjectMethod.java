package ch10_threads;

public class ThreadObjectMethod {
    public static void main(String[] args) {
        ThreadNotify tn = new ThreadNotify();
        tn.start();
        synchronized (tn){
            try{
                System.out.println("tn 작업이 완료될 때까지 기다립니다.");
                tn.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Total is "+ tn.total);
        }
    }
}

class ThreadNotify extends Thread{
    int total;
    @Override
    public void run() {
        synchronized(this){

            for(int i=1;i<=5;i++){
                System.out.println(i+"를 더합니다.");
                total+=i;
                try{
                    Thread.sleep(1000); //딜레이
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            notify();
        }
    }
}
