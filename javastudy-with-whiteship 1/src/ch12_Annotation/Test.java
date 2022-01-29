package ch12_Annotation;

import java.lang.annotation.Repeatable;

@Repeatable(Tests.class)
public @interface Test {
    String value();
}
