package ch14_Generics;

public class GenericDemo5 <T extends Number>{
    private T t;

    public void set(T t){this.t=t;}
    public T get(){return t;}

    public Number show(T e){
        return this.t=e;
    }

    public static void main(String[] args) {
        GenericDemo5<Number> gd5= new GenericDemo5<>();
        System.out.println(gd5.show(new Integer(10)).intValue());
        System.out.println(gd5.show(new Double(20)).intValue());
    }
}
