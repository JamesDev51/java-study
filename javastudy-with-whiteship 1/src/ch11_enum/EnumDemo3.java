package ch11_enum;

public class EnumDemo3 {
    public static void main(String[] args) {
        Transport bus = Transport.BUS;
        System.out.println("Total fare of bus: "+bus.fare(3));
        Transport rentCar = Transport.RENT;
        System.out.println("Total fare for rentCar: "+rentCar.fare(10));
    }
}
