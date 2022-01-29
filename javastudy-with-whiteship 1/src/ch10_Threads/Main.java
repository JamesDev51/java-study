package ch10_Threads;

import static ch10_Threads.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread.");

        Thread anotherThread = new AnotherTread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread(() -> System.out.println(ANSI_GREEN+"Hello from the anonymous class Thread")).start();

//        try {
//            anotherThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anynoymous class's implementation of run()");
                try{
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED+"AnotherThread terminated, or timed out, so I'm running again");
                }catch(InterruptedException e){
                    System.out.println(ANSI_RED+"I couldn't wait after all. I was interrupted");
                }
            }
        });
        myRunnableThread.start();
//        anotherThread.interrupt();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread");


    }
}
