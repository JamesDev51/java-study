package me.whiteship.chapter01.item01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.whiteship.hello.ChineseHelloService;

@Configuration
public class AppConfig {

    @Bean
    public HelloService helloService() {
        return new ChineseHelloService();
    }

}
