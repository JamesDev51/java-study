package ch10_threads;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class ThreadMethod {
    public static void main(String[] args) {
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();
        interruptedThread.interrupt();
    }
    static void sleepTest(){
        Date today ;
        SimpleDateFormat time;
        while(true){
            try {
                today=new Date();
                time=new SimpleDateFormat("hh:mm:ss");
                System.out.println(time.format(today));
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    static void joinTest(){
        System.out.println("joinTest start");
        for(int i=0;i<5;i++){
            Thread thread = new Thread(){
                @Override
                public void run() {
                    System.out.println("join thread");
                }
            };
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("joinTest end");
    }
    static void interruptTest(){
        System.out.println("interruptTest start");
        sleepingThread();
        Thread.interrupted();
        System.out.println("interruptTest end");
    }
    static void sleepingThread(){
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("Let's sleep for 5s");
            }
        };
        try {
            thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Who woke me up?");
        }
    }
}
