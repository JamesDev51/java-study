package ch12_annotation;


import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Target;

@Target({FIELD,TYPE,TYPE_USE})
public @interface NewAnnotation {
}

