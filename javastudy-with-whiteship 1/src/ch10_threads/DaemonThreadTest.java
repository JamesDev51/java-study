package ch10_threads;

public class DaemonThreadTest {
    public static void main(String[] args) {
        DaemonThread dt = new DaemonThread();
        dt.setDaemon(true);
        dt.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class DaemonThread extends Thread{
    @Override
    public void run() {
        System.out.println("is Daemon :" + this.isDaemon());
    }
}
