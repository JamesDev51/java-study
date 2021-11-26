package ch12_annotation;

public @interface AnnotationRule {
    int id =100; //상수 선언 가능
//    String major(int i, int j); //에러 , 매개변수 선언 불가능
//    String minor() throws Exception; //에러, 예외 선언 불가능
//    ArrayList<T> list(); //에러, 요소의 타입에 타입 매개변수 사용 불가
}
