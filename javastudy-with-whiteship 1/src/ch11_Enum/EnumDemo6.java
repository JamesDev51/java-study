package ch11_Enum;

import java.util.EnumSet;

public class EnumDemo6 {
    public static void main(String[] args) {
        EnumSet<Color> set1, set2, set3, set4, set5;

        set1=EnumSet.allOf(Color.class);
        set2=EnumSet.of(Color.RED, Color.GREEN,Color.BLUE);
        set3=EnumSet.complementOf(set2);
        set4=EnumSet.range(Color.YELLOW,Color.NAVY);
        set5=EnumSet.noneOf(Color.class);
        set5.add(Color.BLUE);
        set5.add(Color.GREEN);
        set5.remove(Color.RED);

        System.out.println("set 1 : "+ set1);
        System.out.println("set 2 : "+ set2);
        System.out.println("set 3 : "+ set3);
        System.out.println("set 4 : "+ set4);
        System.out.println("set 5 : "+ set5);
    }
}
