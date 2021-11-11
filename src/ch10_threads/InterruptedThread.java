package ch10_threads;

public class InterruptedThread extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("interruptedThread is sleeping for 5s");
          Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println("Who woke me up?");
        }
    }
}
