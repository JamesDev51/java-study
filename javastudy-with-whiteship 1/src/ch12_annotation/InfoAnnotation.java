package ch12_annotation;

public @interface InfoAnnotation {
    String author();
    String[] testTools();
    Days day();
    DateTime date();
}
