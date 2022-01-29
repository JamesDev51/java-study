package ch11_Enum;

public class EnumDemo1 {
    enum Season{SPRING,SUMMER,FALL,WINTER}

    public static void main(String[] args) {
        printSeason(Season.SUMMER);
    }
    public static void printSeason(Season season){
        switch(season){
            case SPRING:
                System.out.println("봄입니다.");
                break;
            case SUMMER:
                System.out.println("여름입니다.");
                break;
            case FALL:
                System.out.println("가을입니다.");
                break;
            case WINTER:
                System.out.println("겨울입니다.");
                break;
            default:
                throw new IllegalArgumentException("잘못된 계절입니다.");
        }
    }
}
