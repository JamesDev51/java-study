package ch8_interface;

public class G80 implements Sedan{
    @Override
    public String getModel() {
        return "g80";
    }

    @Override
    public int showSpeed() {
        return 100;
    }

    @Override
    public void driveSmooth() {
        System.out.println(getModel()+" is driving smoothly.");
    }
}
