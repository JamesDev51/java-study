package ch11_enum;

public class EnumDemo2 {
    public static final int FRUIT_APPLE =1;
    public static final int FRUIT_PEACH=2;
    public static final int FRUIT_BANANA=3;

    public static final int COMPANY_APPLE=1;
    public static final int COMPANY_GOOGLE=2;
    public static final int COMPANY_FACEBOOK=3;


    public static void main(String[] args) {
//        int type=APPLE;
//        switch(type){
//            case APPLE:
//                System.out.println("32 kcal");
//                break;
//            case PEACH:
//                System.out.println("52 kcal");
//                break;
//            case BANANA:
//                System.out.println("64 kcal");
//                break;
//        }
//        if(Fruit.APPLE==COMPANY_APPLE){
//            System.out.println("equal");
//        }
        Fruit peach = Fruit.PEACH;
        System.out.println("sweet : "+peach.getSugar());
//        Fruit grape = new Fruit(); // 컴파일 에러 발생
    }
}

//interface Fruit{
//    int APPLE=1, PEACH=2, BANANA=3;
//}
//interface Company{
//    int APPLE=1, GOOGLE=2, FACEBOOK=3;
//}
