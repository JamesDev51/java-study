package ch10_Threads.volatileTest;

public class ReadThread extends Thread{
    SharedObject object;
    public ReadThread(SharedObject so){
        this.object=so;
    }
    @Override
    public void run() {
        for(int i =0 ; i< 10;i++){
            System.out.println("r count : "+object.count);
        }
    }
}
