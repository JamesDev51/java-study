package ch12_annotation;

@InfoAnnotation(author = "minseok jeong",testTools = {"JUnit5","Mockito"},day=Days.MON,date=@DateTime(yymmdd="211126",hhmmss = "191904") )
public class MyClass3 {
}
