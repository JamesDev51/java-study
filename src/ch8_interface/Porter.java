package ch8_interface;

public class Porter implements Truck, WithStuckInterface{
    @Override
    public int showSpeed() {
        return 50;
    }

    @Override
    public void go() {
        System.out.println("go !! ");
    }

    @Override
    public void stop() {
        System.out.println("stop !!");
    }

    @Override
    public void withStuck() {
        Truck.super.withStuck();
        WithStuckInterface.super.withStuck();
    }
}
