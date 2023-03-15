package me.whiteship.chapter01.item08.outerclass;

import java.lang.reflect.Field;

public class OuterClass {

    private void hi() {

    }

    class InnerClass {

        public void hello() {
            //inner 클래스에서 outer 클래스를 참조하는 방법 -> 참조가 생기게 되서 gc 에서 처리 문제 생김
            OuterClass.this.hi();
        }

    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();

        System.out.println(innerClass);

        outerClass.printFiled();
    }

    private void printFiled() {
        Field[] declaredFields = InnerClass.class.getDeclaredFields();
        for(Field field : declaredFields) {
            System.out.println("field type:" + field.getType());
            System.out.println("field name:" + field.getName());
        }
    }
}
