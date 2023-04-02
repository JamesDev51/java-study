package me.whiteship.chapter04.item17.part2;

public class StringExample {

    public static void main(String[] args) {
        String name = "whiteship";

        StringBuilder nameBuilder = new StringBuilder(name); //string의 가변 동반 클래스
        nameBuilder.append("keesun");
    }
}
