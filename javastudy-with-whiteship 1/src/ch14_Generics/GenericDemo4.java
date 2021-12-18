package ch14_Generics;

public class GenericDemo4 <T extends Number>{
    public void set(T value){}

    public static void main(String[] args) {
        GenericDemo4<Integer> gd = new GenericDemo4<>();
        gd.set(3);
//        gd.set("hi");
    }
}
