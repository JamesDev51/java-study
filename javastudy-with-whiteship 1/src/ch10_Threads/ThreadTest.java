package ch10_Threads;

public class ThreadTest {
    public static void main(String[] args) {
        //runnable 사용
        RunnableImpl runnable = new RunnableImpl();
        new Thread(runnable).start();

        //thread 사용
        ThreadExtends thread = new ThreadExtends();
        thread.start();
    }
}
