package ch4_Statements;

public class IfManyElseExam {
      public static void main(String[] args) {
            Integer movingSpeed=1;
            if(movingSpeed==0){
                  System.out.println("자동차가 정지 상태");
            }else if(movingSpeed==1){
                  System.out.println("자동차가 서행 중");
            }else if(movingSpeed==2) {
                  System.out.println("자동차가 고속 주행 중");
            } else{
                  System.out.println("속도 확인 불가");
            }
      }
}
