package ch06;

class 궁수{
    String name="궁수";
}
class 전사{
    String name="전사";
}

public class ObjectEx02 {
    public static void main(String[] args) {
        궁수[] s1= new 궁수[2];
        s1[0]=new 궁수();
        s1[1]=new 궁수();

        Object[] s2 = new Object[2];
        s2[0]=new 궁수();
        s2[1]=new 전사();
    }
}
