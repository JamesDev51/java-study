package ch10_Threads.volatileTest;

public class ReadWriteThread extends Thread{
    SharedObject object;
    public ReadWriteThread(SharedObject so){
        this.object=so;
    }
    @Override
    public void run() {
        for(int i =0 ; i< 10;i++){
            object.count++;
            System.out.println("rw count : "+object.count);
        }
    }
}
