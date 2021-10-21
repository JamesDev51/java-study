package ch8_interface;

public class Sonata implements Car{
    @Override
    public String getModel() {
        return "Sonata";
    }

    @Override
    public int showSpeed() {
        return 50;
    }
}