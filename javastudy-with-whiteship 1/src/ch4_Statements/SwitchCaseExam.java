package ch4_Statements;

public class SwitchCaseExam {
      public static void main(String[] args) {
            int carOption=2;
            switch(carOption){
                  case 1:
                        System.out.println("기본 옵션");
                        break;
                  case 2:
                        System.out.println("중급 옵션");
                        break;
                  case 3:
                        System.out.println("프레스티지 최고급 옵션");
                        break;
                  default:
                        System.out.println("옵션 없는 깡통 차");
            }
      }
}
