package me.whiteship.chapter01.item03.field;

/**
 * 인터페이스를 기반으로 mock 객체 생성
 */
public class MockElvis implements IElvis {
    @Override
    public void leaveTheBuilding() {

    }

    @Override
    public void sing() {
        System.out.println("You ain't nothin' but a hound dog.");
    }
}
