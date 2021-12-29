package ch15_Lambda;

@FunctionalInterface
interface MyFunction3{
    void run();
}

public class LambdaDemo5 {
    static void execute(MyFunction3 f){f.run();}
    static MyFunction3 getMyFunction3 (){return ()-> System.out.println("f3.run");}

    public static void main(String[] args) {
        // 함수형 인터페이스를 바로 람다식으로 선언
        MyFunction3 f1 = () -> System.out.println("f1.run");

        //익명 객체 선언해서 run() 메서드 오버라이드
        MyFunction3 f2 = new MyFunction3() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        //MyFunction3를 반환값으로 받기
        MyFunction3 f3 = getMyFunction3();

        f1.run();
        f2.run();
        f3.run();

        //매개변수로 MyFunction3 참조변수를 넘겨주고 해당 메서드에서 실행
        execute(f1);
        //매개변수로 람다식을 바로 넘겨주고 해당 메서드에서 실행
        execute(()-> System.out.println("run"));

    }
}
