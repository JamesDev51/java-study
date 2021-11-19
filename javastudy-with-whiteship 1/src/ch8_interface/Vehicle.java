package ch8_interface;

public interface Vehicle {
    void go();
    void stop();
    static void accelerate(){
        System.out.println("acceleration!");
    }
}
