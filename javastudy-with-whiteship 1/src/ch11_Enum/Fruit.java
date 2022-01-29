package ch11_Enum;

public enum Fruit {
    APPLE(1), PEACH(3), BANANA(5);

    private int sugar;
    Fruit(int sugar){
//        System.out.println("생성자 호출 : "+this.name() );
        this.sugar=sugar;
    }
    public int getSugar(){
        return sugar;
    }
}
