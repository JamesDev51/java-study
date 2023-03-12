package me.whiteship.chapter01.item05.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //스프링 컨테이너가 관리하고 있는 Singleton SpellChecker bean
        SpellChecker spellChecker = applicationContext.getBean(SpellChecker.class);
        spellChecker.isValid("test");
    }
}
