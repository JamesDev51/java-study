package ch8_Interface;

public interface Vehicle {
    void go();
    void stop();
    static void accelerate(){
        System.out.println("acceleration!");
    }
}
