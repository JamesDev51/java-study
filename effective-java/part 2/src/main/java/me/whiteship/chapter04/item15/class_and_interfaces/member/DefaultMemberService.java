package me.whiteship.chapter04.item15.class_and_interfaces.member;

import java.util.Arrays;

class DefaultMemberService implements MemberService {

    private String name;

    private static class PrivateStaticClass {
        void doPrint() {
            // System.out.println(name); //톱레벨 클래스 호출 불가능
        }
    }

    private class PrivateClass {
        void doPrint() {
            System.out.println(name); //톱레벨 클래스 호출 가능
        }
    }

    public static void main(String[] args) {

        Arrays.stream(PrivateClass.class.getDeclaredFields()).forEach(System.out::println);
        System.out.println();
        Arrays.stream(PrivateStaticClass.class.getDeclaredFields()).forEach(System.out::println);
    }

}
