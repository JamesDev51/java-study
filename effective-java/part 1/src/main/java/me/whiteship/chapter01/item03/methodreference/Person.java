package me.whiteship.chapter01.item03.methodreference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Person {

    LocalDate birthday;

    public Person() {

    }

    public Person(LocalDate birthday) {
        this.birthday = birthday;
    }

    // public static int compareByAge(Person a, Person b) {
    //     return a.birthday.compareTo(b.birthday);
    // }

    //임의 객체 인스턴스 메서드 -> comparator 와 호환시키는 형태
    public int compareByAge(Person b) {
        return this.birthday.compareTo(b.birthday);
    }

    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1999, 5, 1));
        dates.add(LocalDate.of(1999, 5, 1));
        dates.add(LocalDate.of(1999, 5, 1));
        Function<LocalDate, Person> aNew = Person::new;
        dates.stream().map(aNew).collect(Collectors.toList());

        List<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(1982, 7, 15)));
        people.add(new Person(LocalDate.of(2011, 3, 2)));
        people.add(new Person(LocalDate.of(2013, 1, 28)));


        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return a.birthday.compareTo(b.birthday);
            }
        });

        people.sort((p1, p2) -> p1.birthday.compareTo(p2.birthday));
        // people.sort((p1, p2) -> Person.compareByAge(p1, p2));
        // people.sort(Person::compareByAge);

        // Person person = new Person(null);
        people.sort(Person::compareByAge);

    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }

}
