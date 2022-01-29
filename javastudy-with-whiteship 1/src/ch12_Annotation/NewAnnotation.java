package ch12_Annotation;


import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Target;

@Target({FIELD,TYPE,TYPE_USE})
public @interface NewAnnotation {
}

