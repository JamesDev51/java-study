package ch10_Threads;

public class ThreadOrderTest {
    public static void main(String[] args) {
        System.out.println("main function start");
        for(int i=0;i<5;i++){
            RunnableImpl runnable = new RunnableImpl();
            new Thread(runnable).start();
        }
        System.out.println("main function end");
    }
}
