package ch06;

import java.util.ArrayList;

public class CollectionEx01 {
    public static void main(String[] args) {
        ArrayList<Integer> c1= new ArrayList<>();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        for (Integer integer : c1) {
            System.out.println(integer);

        }
    }
}
