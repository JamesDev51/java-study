package ch11_Enum;

public class EnumDemo7 {
    public static void main(String[] args) {
        Class<Season> obj1 = Season.SUMMER.getDeclaringClass();
        System.out.println(obj1);
        Object obj2 = Season.WINTER.getDeclaringClass();
        System.out.println(obj2);
        System.out.println(obj1==obj2);
    }
}
