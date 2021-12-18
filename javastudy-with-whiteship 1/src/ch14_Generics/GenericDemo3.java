package ch14_Generics;

public class GenericDemo3 <K,V,T>{
    private K key;
    private V value;
    private T type;

    K getKey(){return key;}
    V getValue(){return value;}
    T getType(){return type;}

    public GenericDemo3(K key, V value, T type) {
        this.key = key;
        this.value = value;
        this.type = type;
    }

    public static void main(String[] args) {
        GenericDemo3<String,Integer,Double> p1= new GenericDemo3<>("Hi",3,3.14);
        GenericDemo3<Double,String,Integer> p2= new GenericDemo3<>(3.14,"Hi",3);
    }
}
