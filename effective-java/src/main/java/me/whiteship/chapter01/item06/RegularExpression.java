package me.whiteship.chapter01.item06;

import java.util.regex.Pattern;

public class RegularExpression {

    private static final Pattern SPLIT_PATTERN = Pattern.compile(",");

    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int j = 0; j < 10000; j++) {
            String name = "keesun,whiteship";

            //split char이 한 글자 일 때는 fast path를 타기 때문에 컴파일 한 Pattern 재사용보다 빠를 수 있다.
            name.split(",");
        // SPLIT_PATTERN.split(name);
        }
        System.out.println(System.nanoTime() - start);
    }
}
