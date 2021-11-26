package ch12_annotation;

public @interface TestInfo {
    String author() default "minseok";
    int cnt();
}
