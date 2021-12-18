package ch14_Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo1 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add("Hello");
        String s1 = (String) list1.get(0);

        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        String s2 = list2.get(0);
    }
}
