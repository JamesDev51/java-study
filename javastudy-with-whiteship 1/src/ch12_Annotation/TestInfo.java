package ch12_Annotation;

public @interface TestInfo {
    String author() default "minseok";
    int cnt();
}
