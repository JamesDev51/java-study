package ch8_interface;

public class Avante implements Car {


    @Override
    public String getModel() {
        return "Avante";
    }
    @Override
    public int showSpeed() {
        return 30;
    }
    public int getWheels(){
        return 4;
    }
}