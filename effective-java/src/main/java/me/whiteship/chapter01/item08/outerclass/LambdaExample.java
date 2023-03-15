package me.whiteship.chapter01.item08.outerclass;

import java.lang.reflect.Field;

public class LambdaExample {

    private int value = 10;

    //Runnable 에서 바깥 객체를 참조하면 LambdaExample 객체가 참조가 생기게 됨
    private Runnable instanceLambda = () -> {
        System.out.println(value);
    };

    public static void main(String[] args) {
        LambdaExample example = new LambdaExample();
        Field[] declaredFields = example.instanceLambda.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("field type: " + field.getType());
            System.out.println("field name: " + field.getName());
        }
    }

}
