package me.whiteship.chapter01.item07.executor;

import me.whiteship.chapter01.item01.Product;

import java.util.concurrent.*;

public class ExecutorsExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int numberOfCpu = Runtime.getRuntime().availableProcessors();

        //쓰레드가 남아있으면 남은 것을 쓰고 없으면 새로운 쓰레드를 만드는 풀
        // ExecutorService executorService = Executors.newCachedThreadPool();
        System.out.println("numberOfCpu = " + numberOfCpu);

        //쓰레드 10개를 가지고 있는 쓰레드 풀을 만들겠다.
        ExecutorService service = Executors.newFixedThreadPool(10);

        //쓰레드 하나로 처리
        ExecutorService singleService = Executors.newSingleThreadExecutor();

        ExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

        //여기서 block 되지 않고 바로 hello를 출력함
        Future<String> submit = service.submit(new Task());

        System.out.println(Thread.currentThread() + " hello");

        //여기서부터 block이 됨 (기다리게 됨)
        System.out.println(submit.get());

        service.shutdown();
    }

    static class Task implements Callable<String> {

        @Override
        public String call() throws Exception {
            Thread.sleep(2000L);
            return Thread.currentThread() + " world";
        }
    }


}
