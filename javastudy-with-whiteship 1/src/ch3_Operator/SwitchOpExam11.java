package ch3_Operator;

public class SwitchOpExam11 {
      public static void main(String[] args) {
            //Java 12이전
            int num=1;
            int returnNum;

            switch(num) {
                  case 1:
                        returnNum = 1;
                        System.out.println("1이 들어옴");
                        break;
                  case 2:
                        returnNum=2;
                        System.out.println("2가 들어옴");
                        break;
                  case 3:
                        returnNum=3;
                        System.out.println("3이 들어옴");
                        break;
            }
      }
}
