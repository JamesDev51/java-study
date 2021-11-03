package ch10_threads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from the main thread.");

        Thread anotherThread = new AnotherTread();
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println("Hello from the anonymous class Thread");
            }
        }.start();

        System.out.println("Hello again from the main thread");


    }
}
