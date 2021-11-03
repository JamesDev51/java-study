package ch10_threads;

public class AnotherTread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from another thread.");
    }
}
