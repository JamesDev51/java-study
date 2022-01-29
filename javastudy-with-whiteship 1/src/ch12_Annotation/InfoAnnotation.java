package ch12_Annotation;

public @interface InfoAnnotation {
    String author();
    String[] testTools();
    Days day();
    DateTime date();
}
