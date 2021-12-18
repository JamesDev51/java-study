package ch14_Generics;

public class GenericDemo2<T> {
    T element;
    void setElement(T element){
        this.element=element;
    }
    T getElement(){
        return element;
    }

    public static void main(String[] args) {
        GenericDemo2<Integer> gd1 = new GenericDemo2<>();
        gd1.setElement(3);
        int value = gd1.getElement();


        GenericDemo2<String> gd2= new GenericDemo2<>();
        gd2.setElement("hello");
    }
}
