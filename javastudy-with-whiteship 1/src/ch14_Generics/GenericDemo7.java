package ch14_Generics;

import java.util.List;

public class GenericDemo7 {
    public static int sizeOfList(List<?> list){
        return list.size();
    }
    public static double sumOfList(List<? extends Number> list){
        double s= 0.0;
        for(Number n : list){
            s+=n.doubleValue();
        }
        return s;
    }
    public static <T extends Number> double sumOfList2(List<T> list){
        double s=0.0;
        for(Number n : list){
            s+=n.doubleValue();
        }
        return s;
    }
}
