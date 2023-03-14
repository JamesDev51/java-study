package me.whiteship.chapter01.item07.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        BigObject strong = new BigObject();
        
        //팬텀 레퍼런스는 gc가 일어나면 원래 오브젝트는 정리하고 팬텀 레퍼런스를 rq에 넣어줌, 따라서 ReferenceQueue 필요
        ReferenceQueue<BigObject> rq = new ReferenceQueue<>(); 

        BigObjectReference<BigObject> phantom = new BigObjectReference<>(strong, rq);
        strong = null;

        System.gc();
        Thread.sleep(3000L);

        // TODO 팬텀은 유령이니까..
        //  죽었지만.. 사라지진 않고 큐에 들어갑니다.
        System.out.println(phantom.isEnqueued());

        Reference<? extends BigObject> reference = rq.poll();
        BigObjectReference bigObjectCleaner = (BigObjectReference) reference;
        bigObjectCleaner.cleanUp();
        reference.clear();
    }
}
