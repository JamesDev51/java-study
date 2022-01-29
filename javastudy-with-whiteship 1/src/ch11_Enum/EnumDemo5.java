package ch11_Enum;

public class EnumDemo5 {
    public static void main(String[] args) {
//        for(Season season : Season.values()){
//            System.out.println(season+" : "+ season.ordinal());
//        }
        Season fall = Season.valueOf("fall");
        System.out.println(fall);
    }
}
