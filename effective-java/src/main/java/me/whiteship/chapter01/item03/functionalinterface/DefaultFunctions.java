package me.whiteship.chapter01.item03.functionalinterface;


import me.whiteship.chapter01.item03.methodreference.Person;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctions {

    public static void main(String[] args) {

        //매개 변수 1개를 받아서 1개를 반환함
        Function<Integer, String> intToString = Object::toString;

        //매개변수가 없고 1개를 리턴함
        Supplier<Person> personSupplier = Person::new; //기본 생성자를 참조
        Function<LocalDate, Person> personFunction = Person::new; //매개변수가 있는 생성자를 참조

        //매개변수를 1개 받아서 아무것도 리턴하지 않음
        Consumer<Integer> integerConsumer = System.out::println;

        //매개변수 1개를 받아서 boolean 을 리턴함 -> 내부에는 판단하는 코드 필요
        Predicate<Person> predicate;
    }
}
