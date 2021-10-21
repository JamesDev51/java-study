package ch8_interface;

public class Main {
    public static void main(String[] args) {
//        Avante avante = new Avante();
//        Sonata sonata = new Sonata();
//        System.out.println("Model : "+avante.getModel()+" Speed: "+avante.showSpeed());
//        System.out.println("Model : "+ sonata.getModel()+" Speed: "+sonata.showSpeed());
//
//        Car avante2 = new Avante();
//        Car sonata2 = new Sonata();
//        System.out.println("Model : "+avante2.getModel()+" Speed: "+avante2.showSpeed());
//        System.out.println("Model : "+ sonata2.getModel()+" Speed: "+sonata2.showSpeed());
        Car gv80_1 = new GV80();
        Vehicle gv80_2 = new GV80();
        Suv  gv80_3 = new GV80();
        Vehicle.accelerate();
    }
    }
