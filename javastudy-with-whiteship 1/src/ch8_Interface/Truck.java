package ch8_Interface;

public interface Truck extends Car,Vehicle{
    default void withStuck(){
        saySomething();
    }
    static void withItems(){

    }
    private void saySomething(){
        System.out.println("it has stuck or items");
    }
}
