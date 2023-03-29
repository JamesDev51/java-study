package me.whiteship.chapter01.item03.staticfactory;

// 코드 3-2 정적 팩터리 방식의 싱글턴 (24쪽)
public class Elvis implements Singer {

    //싱글턴 인스턴스에 대해 private 으로 접근 제한
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() { }

    //정적 메서드를 사용해서 싱글턴 인스턴스에 접근 가능
    public static Elvis getInstance() { return INSTANCE; }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    // 이 메서드는 보통 클래스 바깥(다른 클래스)에 작성해야 한다!
    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();

        System.out.println(Elvis.getInstance());
        System.out.println(Elvis.getInstance());
    }

    @Override
    public void sing() {
        System.out.println("my way~~~");
    }
}
