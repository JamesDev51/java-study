package ch8_interface;

public class GV80 implements Suv{
    @Override
    public String getModel() {
        return "gv80";
    }

    @Override
    public int showSpeed() {
        return 120;
    }

    @Override
    public void campingWithSuv() {
        System.out.println("차박 is good");
    }

    @Override
    public void go() {
        System.out.println("go");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
