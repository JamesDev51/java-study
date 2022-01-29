package ch10_Threads.volatileTest;

public class SharedObject {
    public int count=0;

    public static void main(String[] args) {
        SharedObject so = new SharedObject();
        ReadWriteThread rw = new ReadWriteThread(so);
        ReadThread r = new ReadThread(so);
        rw.start();
        r.start();
    }
}
