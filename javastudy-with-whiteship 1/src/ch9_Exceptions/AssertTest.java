package ch9_Exceptions;

public class AssertTest {
    public static void doAssert(int i){
        assert i>1 : "i는 1보다 커야 한다.";
        System.out.println("i :" + i);
    }
    public static void main(String[] args) {
        doAssert(2); //정상 통과
        doAssert(0); //AssertionError 발생
    }
}
