package me.whiteship.chapter01.item01;

import me.whiteship.hello.ChineseHelloService;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    public static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //HelloService 타입을 로드 -> 참조할 수 있는 classPath 에 등록되어 있는 HelloService 의 모든 구현체를 가져옴 (iterable)

        //chinese hello service 에 의존적이지 않음 -> 어떤 구현체가 올 지 알 수 없음
        // ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        // Optional<HelloService> helloServiceOptional = loader.findFirst();
        // helloServiceOptional.ifPresent(h -> {
        //     System.out.println(h.hello());
        // });

        //chinese hello service 에 의존적임
        // HelloService helloService = new ChineseHelloService();
        // System.out.println(helloService.hello());

        //class 의 full name 을 reference 로 사용
       Class<?> aClass = Class.forName("me.whiteship.hello.ChineseHelloService"); //class 레퍼런스
       Constructor<?> constructor = aClass.getConstructor(); //생성자
       HelloService helloService = (HelloService) constructor.newInstance(); //인스턴스
       System.out.println(helloService.hello()); //메서드 사용
    }

}
