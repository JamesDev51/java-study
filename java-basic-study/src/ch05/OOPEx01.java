package ch05;

class Player{
    private String name; //이름
    private int thirty; //목마름
    public Player(String name, int thirty){
        this.name=name;
        this.thirty=thirty;
    }

    //행위 = 메서드 = 값을 변경
    void 물마시기(){
        System.out.println("물마시기 행위");
        this.thirty=this.thirty-50;
    }
    int 목마름상태확인(){
        return this.thirty;
    }
}


public class OOPEx01 {
    public static void main(String[] args) {
        Player p1= new Player("홍길동 ",100);
//        System.out.println("이름은 : " +p1.name);
        System.out.println("갈증지수 : " +p1.목마름상태확인());

        //1
//        p1.thirty=50; //원인없이 갈증지수 변경하면 안됨

        //2.
//        p1.물마시기();
//        System.out.println("갈증지수 : " +p1.thirty);

        //3.




    }
}
