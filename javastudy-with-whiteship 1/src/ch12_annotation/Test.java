package ch12_annotation;

import java.lang.annotation.Repeatable;

@Repeatable(Tests.class)
public @interface Test {
    String value();
}
