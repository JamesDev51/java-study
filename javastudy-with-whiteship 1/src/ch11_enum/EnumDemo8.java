package ch11_enum;

import java.util.EnumMap;

public class EnumDemo8 {
    public static void main(String[] args) {
        EnumMap<Color, String> enumMap=new EnumMap<Color, String>(Color.class);
        enumMap.put(Color.BLUE,"cool blue");
        enumMap.put(Color.RED,"massive red");
        System.out.println("size of enumMap : "+enumMap.size());
        System.out.println("value of Color.BLUE : "+enumMap.get(Color.BLUE));
        System.out.println("does enumMap contain Color.GREEN : "+enumMap.containsKey(Color.GREEN));
        System.out.println("does enumMap contain Color.RED : "+enumMap.containsKey(Color.RED));

        EnumMap<Color,String> otherMap = new EnumMap<Color, String>(Color.class);
        otherMap.putAll(enumMap);
        System.out.println("enumMap : "+enumMap);
        System.out.println("otherMap : "+otherMap);

    }
}
