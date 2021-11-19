package ch10_threads;

public class ThreadExtends extends Thread{
    @Override
    public void run() {
        System.out.println("This is ThreadExtends extends Thread");
    }
}
