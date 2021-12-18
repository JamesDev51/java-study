package ch14_Generics;

class Util{
    public static <U> GenericDemo6<U> put(U u){
        return new GenericDemo6(u);
    }
}

public class GenericDemo6 <T> {
    private T t;
    public GenericDemo6(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        String frog = "개구리";
        GenericDemo6<String> gd = Util.put(frog);

        System.out.println(gd.t);
    }
}
